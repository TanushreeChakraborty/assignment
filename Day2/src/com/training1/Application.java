package com.training1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv=new Product(1001,"led",23000.00,3);
		tv.setRatePerUnit(1230);
		Product fridge=new Product(1001,"fr",23300.00,3);
		fridge.setRatePerUnit(1200);
		ManageProduct mgr=new ManageProduct();
		
		int tax=mgr.taxPercent(tv);
		
		System.out.println(tax);
		
		//arraylist
		
		Product[]productList=new Product[2];
		productList[0]=tv;
		productList[1]=fridge;
		//Product[]productList={tv,fridge};
		tv.setDiscount(20);
		fridge.setDiscount(30);
		
		mgr.showProductsforeach(productList);
		mgr.calculateDiscount(productList);
		//Product[]discount=mgr.calculateDiscount(productList);
		//System.out.println(discount);
		
		for(Product ptList:productList) {
			
			System.out.println(ptList.getProdName());
			System.out.println("discount"+ptList.getDiscount());
			
		}
	}

}
