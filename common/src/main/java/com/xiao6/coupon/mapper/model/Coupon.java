package com.xiao6.coupon.mapper.model;

public class Coupon {

    private Long id;
    private String cardNum;
    private String cardPwd;
    private String sku;
    private String spu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu;
    }

    public Coupon(String cardNum, String cardPwd) {
        this.cardNum = cardNum;
        this.cardPwd = cardPwd;
    }

    public Coupon() {
    }
}
