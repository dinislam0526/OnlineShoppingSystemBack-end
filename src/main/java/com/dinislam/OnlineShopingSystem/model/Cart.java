package com.dinislam.OnlineShopingSystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cart_id;
	private Long userId;
	private Integer pro_id;
    private long catid;
    private String pro_name;
    private String pro_cat;
    private String pro_image;
    private int pro_price;
    private String pro_desc;
    private int Pro_qnt;

    
	public Long getCart_id() {
		return cart_id;
	}
	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getPro_id() {
		return pro_id;
	}
	public void setPro_id(Integer pro_id) {
		this.pro_id = pro_id;
	}
	public long getCatid() {
		return catid;
	}
	public void setCatid(long catid) {
		this.catid = catid;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_cat() {
		return pro_cat;
	}
	public void setPro_cat(String pro_cat) {
		this.pro_cat = pro_cat;
	}
	public String getPro_image() {
		return pro_image;
	}
	public void setPro_image(String pro_image) {
		this.pro_image = pro_image;
	}
	public int getPro_price() {
		return pro_price;
	}
	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	public String getPro_desc() {
		return pro_desc;
	}
	public void setPro_desc(String pro_desc) {
		this.pro_desc = pro_desc;
	}
	public int getPro_qnt() {
		return Pro_qnt;
	}
	public void setPro_qnt(int pro_qnt) {
		Pro_qnt = pro_qnt;
	}
	
	
	
    
    
}
