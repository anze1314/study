package com.team.springboot.service;

import com.team.springboot.pojo.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductCategoryService {
    String selectCidBycName(String c_Name);
    void insertProductCategory(ProductCategory productCategory);
    List<ProductCategory> selectProductCategorys(int page, int limit);
    List<ProductCategory> selectProductCategorysByaccount(String p_Account,int page, int limit);
    List<ProductCategory> selectProductAll();

    List<ProductCategory>selectProductCategorysByp_name(int page, int limit,String p_Name);
    List<ProductCategory>selectProductCategorysByp_nameAndaccount(int page, int limit,String p_Name,String p_Account);
    List<ProductCategory>selectAllcName();
    int selectMaxP_Id();
    List<ProductCategory>selectProductCategorysByp_name1(String p_Name);

    List<ProductCategory>selectFive();
    //更新状态
    void updateProduct (int  productCategoryId,int state);

    List<String> getHot();

   List<String> getMyHot(String sid);
}
