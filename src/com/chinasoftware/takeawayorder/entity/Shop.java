package com.chinasoftware.takeawayorder.entity;

/**
 * @author: DX
 * @date: 2019/12/10 14:10
 */
public class Shop {
    /**
     * 店铺
     */
    String shopId;
    /**
     * 店铺名
     */
    String shopName;
    /**
     * 店铺所有人
     */
    User shopOwner;
    /**
     * 店铺位置
     */
    String shopLocaidtion;
    /**
     * 店铺图片
     */
    String shopPhoto;
    /**
     * 店铺电话
     */
    String shopTell;

    /**
     * 店铺描述
     */
    String shopDescription;

    /**
     * 店铺评价
     */
    String shopAssess;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public User getShopOwner() {
        return shopOwner;
    }

    public void setShopOwner(User shopOwner) {
        this.shopOwner = shopOwner;
    }

    public String getShopLocaidtion() {
        return shopLocaidtion;
    }

    public void setShopLocaidtion(String shopLocaidtion) {
        this.shopLocaidtion = shopLocaidtion;
    }

    public String getShopPhoto() {
        return shopPhoto;
    }

    public void setShopPhoto(String shopPhoto) {
        this.shopPhoto = shopPhoto;
    }

    public String getShopTell() {
        return shopTell;
    }

    public void setShopTell(String shopTell) {
        this.shopTell = shopTell;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public String getShopAssess() {
        return shopAssess;
    }

    public void setShopAssess(String shopAssess) {
        this.shopAssess = shopAssess;
    }

    public Shop(String shopId, String shopName, User shopOwner, String shopLocaidtion, String shopPhoto, String shopTell, String shopDescription, String shopAssess) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopOwner = shopOwner;
        this.shopLocaidtion = shopLocaidtion;
        this.shopPhoto = shopPhoto;
        this.shopTell = shopTell;
        this.shopDescription = shopDescription;
        this.shopAssess = shopAssess;
    }
}
