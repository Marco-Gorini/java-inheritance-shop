package com.soprasteria;

public class Television extends Product{
	
	private final boolean smart;
	private final float lenght;  //cm
	private final float height;  //cm
	
	//Constructor
	
	public Television(int codeProduct, boolean smart, float lenght, float height) {
		super(codeProduct);
		this.smart = smart;
		this.lenght = lenght;
		this.height = height;
	}
	
	//Getters
	
	public boolean isSmart() {
		return smart;
	}

	public float getLenght() {
		return lenght;
	}

	public float getHeight() {
		return height;
	}

	@Override
	public String toString() {
		String string = (super.getCodeProduct() + "\n" + super.getIva() + "\n" + super.getMark() + "\n" + super.getPrice() + "$\n" + smart + "\n" + height + "cm\n" + lenght + "cm\n");
		return string;
	}
}
