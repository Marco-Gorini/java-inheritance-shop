package com.soprasteria;

public class Smartphone extends Product{
	
	private final int imeiCode;
	private final float memory;
	
	//Constructor
	
	public Smartphone(int codeProduct, int imeiCode, float memory) {
		super(codeProduct);
		this.imeiCode = imeiCode;
		this.memory = memory;
	}
	
	//Getters
	
	public int getImeiCode() {
		return imeiCode;
	}

	public float getMemory() {
		return memory;
	}
	
	@Override
	public String toString() {
		String string = (super.getCodeProduct() + "\n" + super.getIva() + "\n" + super.getMark() + "\n" + super.getPrice() + "\n" + memory  + "GB \n" + imeiCode + "\n");
		return string;
	}

}
