package com.team.springboot.pojo;

//多表查询拼接而来的实体  表 order2 prodcut
public class Order {
    private String o_Id;
    private int o_ItemId;
    private String o_Seller;
    private String o_Buyer;
    private String o_Baddress;
    private String o_Saddress;
    private String p_Title;
    private String o_Status;
    private String p_href;
    private int  o_State; //商品状态
//    @Override
//    public String toString() {
//        return " o_Id:" + this.getO_Id() + " o_ItemId:" + this.getO_ItemId() + " p_Title:" + this.getP_Title();
//    }

    public  int getO_State(){
        return this.o_State;
    }
    public void setO_State(int o_State){
        this.o_State = o_State;
    }
    public Order() {

    }

    public String getP_href() {
        return p_href;
    }

    public void setP_href(String p_href) {
        this.p_href = p_href;
    }

    public String getO_Status() {
        return o_Status;
    }

    public void setO_Status(String o_Status) {
        this.o_Status = o_Status;
    }

    public String getO_Baddress() {
        return o_Baddress;
    }

    public void setO_Baddress(String o_Baddress) {
        this.o_Baddress = o_Baddress;
    }

    public String getO_Saddress() {
        return o_Saddress;
    }

    public void setO_Saddress(String o_Saddress) {
        this.o_Saddress = o_Saddress;
    }

    public String getP_Title() {
        return p_Title;
    }

    public void setP_Title(String p_Title) {
        this.p_Title = p_Title;
    }

    public String getO_Id() {
        return o_Id;
    }

    public void setO_Id(String o_Id) {
        this.o_Id = o_Id;
    }

    public int getO_ItemId() {
        return o_ItemId;
    }

    public void setO_ItemId(int o_ItemId) {
        this.o_ItemId = o_ItemId;
    }

    public String getO_Seller() {
        return o_Seller;
    }

    public void setO_Seller(String o_Seller) {
        this.o_Seller = o_Seller;
    }

    public String getO_Buyer() {
        return o_Buyer;
    }

    public void setO_Buyer(String o_Buyer) {
        this.o_Buyer = o_Buyer;
    }

}
