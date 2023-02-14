package com.inter;

import java.util.Scanner;

class ProductException extends Exception{
	ProductException(String s){
		super(s);
	}
}
class Product{
	public void productPriceCheck(float price) {
		try {
			if(price<0 || price>=1000) {
				throw new ProductException("Invalid product price");
			}else {
				System.out.println("valid product price");
			}
		}catch(ProductException e) {
			e.printStackTrace();
		}
	}
}

public class ProductMain {

	public static void main(String[] args) {
		float price;
		System.out.println("Enter the price");
		Scanner sc = new Scanner(System.in);
		price = sc.nextFloat();
		
		Product ob = new Product();
		ob.productPriceCheck(price);
		

	}

}
