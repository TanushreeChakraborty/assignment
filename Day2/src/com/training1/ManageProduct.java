package com.training1;

public class ManageProduct {

	public double calculateDiscount(Product product) {
		
		double discount=0.0;
		
		//ifelse
		if(product.getRatePerUnit()>500 && product.getRatePerUnit()<=1000) {
			
			discount=0.10;
			
		}else if(product.getRatePerUnit()>1000) {
			
			discount=0.15;
		}
		
		return discount;
		
	}
	
	public void showProducts() {
		for(int i=0;i<10;i++) {
			System.out.println("product");
		}
	}
	
	public int taxPercent(Product product) {
		int tax;
		int p=product.getProductType();
		switch(p) {
		
		case 1:tax=5;
		return tax;
		case 2:tax=10;
		return tax;
		case 3:tax=15;
		return tax;
		default: tax=28;
		return tax;
		}
	}
}
