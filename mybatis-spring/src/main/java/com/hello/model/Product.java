package com.hello.model;

import java.util.Date;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.id
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private Float price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.weight
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private Float weight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.short_desc
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private String short_desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.image
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private String image;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.category_id
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private Integer category_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.update_time
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private Date update_time;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.stock
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private Float stock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.live
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private Boolean live;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.unlimited
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private Boolean unlimited;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.location
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.long_desc
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    private String long_desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.id
     *
     * @return the value of product.id
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.id
     *
     * @param id the value for product.id
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.weight
     *
     * @return the value of product.weight
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.weight
     *
     * @param weight the value for product.weight
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.short_desc
     *
     * @return the value of product.short_desc
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public String getShort_desc() {
        return short_desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.short_desc
     *
     * @param short_desc the value for product.short_desc
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc == null ? null : short_desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.image
     *
     * @return the value of product.image
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.image
     *
     * @param image the value for product.image
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.category_id
     *
     * @return the value of product.category_id
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public Integer getCategory_id() {
        return category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.category_id
     *
     * @param category_id the value for product.category_id
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.update_time
     *
     * @return the value of product.update_time
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public Date getUpdate_time() {
        return update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.update_time
     *
     * @param update_time the value for product.update_time
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.stock
     *
     * @return the value of product.stock
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public Float getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.stock
     *
     * @param stock the value for product.stock
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setStock(Float stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.live
     *
     * @return the value of product.live
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public Boolean getLive() {
        return live;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.live
     *
     * @param live the value for product.live
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setLive(Boolean live) {
        this.live = live;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.unlimited
     *
     * @return the value of product.unlimited
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public Boolean getUnlimited() {
        return unlimited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.unlimited
     *
     * @param unlimited the value for product.unlimited
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setUnlimited(Boolean unlimited) {
        this.unlimited = unlimited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.location
     *
     * @return the value of product.location
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.location
     *
     * @param location the value for product.location
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.long_desc
     *
     * @return the value of product.long_desc
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public String getLong_desc() {
        return long_desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.long_desc
     *
     * @param long_desc the value for product.long_desc
     *
     * @mbggenerated Fri Jun 10 13:23:04 CST 2016
     */
    public void setLong_desc(String long_desc) {
        this.long_desc = long_desc == null ? null : long_desc.trim();
    }
}