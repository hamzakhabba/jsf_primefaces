package com.emsi.web.control;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = -7025486226371866939L;
	private String id;
	private String brand;
	private int year;
	private String color;
	private int price;
	private boolean sold;

	/**
	 * @param id
	 * @param brand
	 * @param year
	 * @param color
	 */
	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id
	 * @param brand
	 * @param year
	 * @param color
	 * @param price
	 * @param soldState
	 */
	public Car(String id, String brand, int year, String color, int price, boolean soldState) {
		super();
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.price = price;
		this.sold = soldState;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the soldState
	 */
	public boolean isSold() {
		return sold;
	}
	/**
	 * @param soldState the soldState to set
	 */
	public void setSold(boolean sold) {
		this.sold = sold;
	}

	
}
