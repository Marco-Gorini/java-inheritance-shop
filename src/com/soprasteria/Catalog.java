package com.soprasteria;

import java.util.Scanner;

public class Catalog {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insert the number of the products you want to insert: ");
		int dim = in.nextInt();
		Product[] products = new Product[dim];
		for(int i = 0; i < dim; i++) {
			System.out.print("Insert the code product: ");
			int codeProduct = in.nextInt();
			in.nextLine();
			System.out.print("Insert the mark of the product: ");
			String markProduct = in.nextLine();
			System.out.print("Insert the price of the product: ");
			float priceProduct = in.nextFloat();
			in.nextLine();
			System.out.print("Insert the iva of the product: ");
			float ivaProduct = in.nextFloat();
			in.nextLine();
			System.out.println("Insert the name of the product you want (headphones,smartphone,television): ");
			String productToInsert = in.nextLine();
			if(productToInsert.equalsIgnoreCase("headphones")) {
				System.out.print("Insert the color of the headphones: ");
				String colorHeadphones = in.nextLine();
				System.out.print("Write true if you want them wireless, else false: ");
				boolean wirelessHeadphones = in.nextBoolean();
				products[i] = new Headphones(codeProduct,colorHeadphones,wirelessHeadphones);
				products[i].setMark(markProduct);
				products[i].setIva(ivaProduct);
				products[i].setPrice(priceProduct);
				
			}
			if(productToInsert.equalsIgnoreCase("smartphone")) {
				System.out.print("Insert the imiei code: ");
				int imieiCodeSmartphone = in.nextInt();
				in.nextLine();
				System.out.print("Insert the memory: ");
				float memorySmartphone = in.nextFloat();
				in.nextLine();
				products[i] = new Smartphone(codeProduct, imieiCodeSmartphone, memorySmartphone);
				products[i].setMark(markProduct);
				products[i].setIva(ivaProduct);
				products[i].setPrice(priceProduct);
			}
			if(productToInsert.equalsIgnoreCase("television")) {
				System.out.print("Write true if you want the television smart, else false: ");
				boolean smartTelevision = in.nextBoolean();
				System.out.print("Insert the lenght of the television: ");
				float lenghtTv = in.nextFloat();
				in.nextLine();
				System.out.print("Insert the height of the television: ");
				float heightTv = in.nextFloat();
				in.nextLine(); 
				products[i] = new Television(codeProduct, smartTelevision, lenghtTv, heightTv);
				products[i].setMark(markProduct);
				products[i].setIva(ivaProduct);
				products[i].setPrice(priceProduct);
			}
		}
		for(int i = 0; i < dim; i++) {
			System.out.println(products[i].toString());
		}
	}
	
}
