package com.devsuperior.entities;


/* 
 * Order entity with it's variable declarations, constructor, getters and setters. 
 */
public class Order {

	private int code;
	private double basicValue;
	private double discountPercentage;
	
	public Order(int code, double basicValue, double discountPercentage) {
		super();
		this.code = code;
		this.basicValue = basicValue;
		this.discountPercentage = discountPercentage;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getBasicValue() {
		return basicValue;
	}

	public void setBasicValue(double basicValue) {
		this.basicValue = basicValue;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	
} 