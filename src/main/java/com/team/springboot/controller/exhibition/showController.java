package com.team.springboot.controller.exhibition;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.springboot.pojo.ProductCategory;
import com.team.springboot.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class showController {

    @Autowired
    ProductCategoryService productCategoryService;
    //前台展示初始化
    @RequestMapping({"/showAll","/"})
    public String showAll(Model m, @RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo, HttpServletRequest request){
        //System.out.println(pageNo);
        Integer pageSize = 15;
        PageHelper.startPage(pageNo,pageSize);
        List<ProductCategory> list = productCategoryService.selectProductAll();
        PageInfo<ProductCategory> pageInfo = new PageInfo<ProductCategory>(list,pageSize);
        m.addAttribute("productList",pageInfo);

        //获取自己感兴趣的商品
        HttpSession session = request.getSession();
        List<String> ss = (List<String>) session.getAttribute("myhot");
        if(ss!=null && ss.size()>0){
            m.addAttribute("hotlist",ss);

        }
        else {
            List<String> hotList = new ArrayList<String>();

            hotList=productCategoryService.getHot();
            m.addAttribute("hotlist",hotList);
        }



        return "Exhibition/user";
    }
    //前台搜索功能
    @RequestMapping("/search")
    public String search(Model m,@RequestParam(defaultValue="1",required=true,value="pageNo") Integer pageNo,
                    @RequestParam("search")String search){
        List<String> hotList = new ArrayList<String>();

        hotList=productCategoryService.getHot();
        m.addAttribute("hotlist",hotList);
        Integer pageSize = 15;
        if("lucky".equals(search)){
            PageHelper.startPage(pageNo,pageSize);
            List<ProductCategory> list = productCategoryService.selectFive();
            PageInfo<ProductCategory> pageInfo = new PageInfo<ProductCategory>(list,pageSize);
            m.addAttribute("productList",pageInfo);
            return "Exhibition/user";
        }
        search="%"+search+"%";
        PageHelper.startPage(pageNo,pageSize);
        List<ProductCategory> list = productCategoryService.selectProductCategorysByp_name1(search);
        PageInfo<ProductCategory> pageInfo = new PageInfo<ProductCategory>(list,pageSize);
        m.addAttribute("productList",pageInfo);
        return "Exhibition/user";
    }
}
