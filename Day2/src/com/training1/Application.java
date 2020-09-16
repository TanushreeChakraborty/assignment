package com.training1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv=new Product(1001,"led",23000.00,3);
		ManageProduct mgr=new ManageProduct();
		double discount=mgr.calculateDiscount(tv);
		int tax=mgr.taxPercent(tv);
		System.out.println(discount);
		System.out.println(tax);
	}

}
