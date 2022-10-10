package com.soprasteria;

public class Headphones extends Product{
	
	private final String color;
	private final boolean wireless;
	
	//Constructor
	
	public Headphones(int codeProduct, String color, boolean wireless) {
		super(codeProduct);
		this.color = color;
		this.wireless = wireless;
	}

	//Getters
	
	public String getColor() {
		return color;
	}

	public boolean isWireless() {
		return wireless;
	}
	
	@Override
	public String toString() {
		String string = (super.getCodeProduct() + "\n" + super.getIva() + "\n" + super.getMark() + "\n" + super.getPrice() + "\n" + color + "\n" + wireless);
		return string;
	}
}
