package com.team.springboot.pojo;

import java.sql.Date;

public class ProductCategory {
    private int p_Id;
    private String p_Account;
    private String p_Name;
    private String c_Id;
    private String p_Title;
    private String c_Name;
    private Date p_Date;
    private Double p_Price;
    private String p_Des;
    private String p_href;
    private int p_state;

    public ProductCategory() {

    }

    public String getP_href() {
        return p_href;
    }

    public void setP_href(String p_href) {
        this.p_href = p_href;
    }

    public int getP_Id() {
        return p_Id;
    }

    public void setP_Id(int p_Id) {
        this.p_Id = p_Id;
    }

    public String getP_Account() {
        return p_Account;
    }

    public void setP_Account(String p_Account) {
        this.p_Account = p_Account;
    }

    public String getP_Name() {
        return p_Name;
    }

    public void setP_Name(String p_Name) {
        this.p_Name = p_Name;
    }

    public String getC_Id() {
        return c_Id;
    }

    public void setC_Id(String c_Id) {
        this.c_Id = c_Id;
    }

    public String getC_Name() {
        return c_Name;
    }

    public void setC_Name(String c_Name) {
        this.c_Name = c_Name;
    }

    public Date getP_Date() {
        return p_Date;
    }

    public void setP_Date(Date p_Date) {
        this.p_Date = p_Date;
    }

    public Double getP_Price() {
        return p_Price;
    }

    public void setP_Price(Double p_Price) {
        this.p_Price = p_Price;
    }

    public String getP_Des() {
        return p_Des;
    }

    public void setP_Des(String p_Des) {
        this.p_Des = p_Des;
    }

    public String getP_Title() {
        return p_Title;
    }

    public void setP_Title(String p_Title) {
        this.p_Title = p_Title;
    }

    public int getP_state() {
        return p_state;
    }

    public void setP_state(int p_state) {
        this.p_state = p_state;
    }
}
