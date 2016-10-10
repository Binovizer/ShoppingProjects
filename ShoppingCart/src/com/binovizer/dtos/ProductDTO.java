package com.binovizer.dtos;

public class ProductDTO {
	private int product_id;
	private String product_name;
	private double product_price;
	private int product_discount;
	private int item_id;
	private String product_desc;
	private String product_img_url;
	private String product_in_stock;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public int getProduct_discount() {
		return product_discount;
	}
	public void setProduct_discount(int product_discount) {
		this.product_discount = product_discount;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public String getProduct_img_url() {
		return product_img_url;
	}
	public void setProduct_img_url(String product_img_url) {
		this.product_img_url = product_img_url;
	}
	public String getProduct_in_stock() {
		return product_in_stock;
	}
	public void setProduct_in_stock(String product_in_stock) {
		this.product_in_stock = product_in_stock;
	}
	
}
