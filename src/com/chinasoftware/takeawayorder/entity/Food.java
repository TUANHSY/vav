package com.chinasoftware.takeawayorder.entity;

/**
 * @author: DX
 * @date: 2019/12/10 11:32
 */
public class Food {
    /**
     * 食物编号
     */
    private String foodId;
    /**
     * 食物名称
     */
    private String foodName;
    /**
     * 食物图片
     */
    private String foodPhotoUrl;
    /**
     * 食物描述
     */
    private String foodDescription;

    private Shop shop;

    /**
     * 价格
     */
    private double price;

    /**
     * 食物的评价
     */
    private String foodAssess;

    public Food() {
    }

    /**
     * @param foodId 食物id
     * @param foodName 食物名称
     * @param shop 店铺名
     * @param foodPhotoUrl 食物图片路径
     * @param foodDescription 食物描述
     * @param price 价格
     */
    public Food(String foodId, String foodName,Shop shop, String foodPhotoUrl, String foodDescription,double price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.shop = shop;
        this.foodPhotoUrl = foodPhotoUrl;
        this.foodDescription = foodDescription;
        this.price = price;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPhotoUrl() {
        return foodPhotoUrl;
    }

    public void setFoodPhotoUrl(String foodPhotoUrl) {
        this.foodPhotoUrl = foodPhotoUrl;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFoodAssess() {
        return foodAssess;
    }

    public void setFoodAssess(String foodAssess) {
        this.foodAssess = foodAssess;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
