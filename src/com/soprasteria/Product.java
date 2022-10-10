package com.soprasteria;

public class Product {
	
	private final int codeProduct;
	private String mark;
	private float price;
	private float iva;
	
	//Constructor
	
	public Product(int codeProduct) {
		this.codeProduct = codeProduct;
	}
	
	//Getters and Setters
	
	public int getCodeProduct() {
		return codeProduct;
	}


	public String getMark() {
		return mark;
	}
	

	public void setMark(String mark) {
		this.mark = mark;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}
	
	//Other Methods
	
	public float totalPrice() {
		return price + price*iva;
	}
	
	@Override
	public String toString() {
		return "yes";
	};
	
	
	
}
