package com.team.springboot.mapper;

import com.team.springboot.pojo.ProductCategory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ProductCategoryMapper {
    @Select("Select c_Id from Controller where c_Name=#{0}")
    String selectCidBycName(String c_Name);
    @Insert("insert into product(p_Id, p_Account,p_Name,c_Id,p_Title,p_Des,p_Price,p_Date,p_state) values(#{p_Id},#{p_Account}, #{p_Name}, #{c_Id}, #{p_Title}, #{p_Des},#{p_Price},#{p_Date},#{p_state})")
    void insertProductCategory(ProductCategory productCategory);
    @Select("select p_Id,p_Account,p_Name,c_Name,p_Title,p_Price,p_href ,p_state from product inner join category on product.c_Id=category.c_Id where product.p_state = 0 limit #{0}, #{1}")
    List<ProductCategory> selectProductCategorys(int page, int limit);
    @Select("select p_Id,p_Account,p_Name,c_Name,p_Title,p_Price,p_href,p_state from product inner join category on product.c_Id=category.c_Id where p_Account = #{0} limit #{1}, #{2}")
    List<ProductCategory> selectProductCategorysByaccount(String p_Account,int page, int limit);
    @Select("select p_Id,p_Account,p_Name,c_Name,p_Title,p_Price,p_href,p_state from product inner join category on product.c_Id=category.c_Id where product.p_state = 0 ")
    List<ProductCategory> selectProductAll();

    @Select("select p_href, p_Id,p_Account,p_Name,c_Name,p_Title,p_Price,p_state from product inner join category on product.c_Id=category.c_Id where product.p_state = 0 and (p_Title like #{2} OR p_Name like #{2}) limit #{0}, #{1}")
    List<ProductCategory>selectProductCategorysByp_name(int page, int limit,String p_Name);

    @Select("select p_href, p_Id,p_Account,p_Name,c_Name,p_Title,p_Price,p_state from product inner join category on product.c_Id=category.c_Id where product.p_state = 0 and (p_Title like #{2} OR p_Name like #{2}) AND p_Account = #{3} limit #{0}, #{1}")
    List<ProductCategory>selectProductCategorysByp_nameAndaccount(int page, int limit,String p_Name,String p_Account);

    @Select("select c_Name from category")
    List<ProductCategory>selectAllcName();

    @Select("select max(p_Id) from product where product.p_state = 0")
    int selectMaxP_Id();

    @Select("select p_href, p_Id,p_Account,p_Name,c_Name,p_Title,p_Price,p_state from product inner join category on product.c_Id=category.c_Id where product.p_state = 0 and (p_Title like #{0} OR p_Name like #{0})")
    List<ProductCategory>selectProductCategorysByp_name1(String p_Name);

    @Select("select p_href, p_Id,p_Account,p_Name,c_Name,p_Title,p_Price,p_state from product inner join category on product.c_Id=category.c_Id   ORDER BY RAND() ")
    List<ProductCategory> selectFive();

    @Update("update product set p_state = #{1} where p_Id = #{0}")
    void updateProductCategory( int productCategoryId,int state);
}
