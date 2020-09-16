package com.training1;

public class ManageProduct {

	public Product[] calculateDiscount(Product[]productList) {
		
		
		
		//ifelse
		for(Product eachProduct:productList) {
			double discount=0;
		if(eachProduct.getRatePerUnit()>500 && eachProduct.getRatePerUnit()<=1000) {
			
			discount=0.10;
			
		}else if(eachProduct.getRatePerUnit()>1000) {
			
			discount=0.15;
		}
		eachProduct.setDiscount(discount);
		}
		
		return productList;
		
	}
	
	public void showProductsLegacy(Product[]productList) {
		for(int i=0;i<productList.length;i++) {
			System.out.println("product"+i+"=>"+productList[i].getProdName());
		}
	}
	
	public void showProductsforeach(Product[]productList) {
		for(Product eachProduct:productList) {
			
			System.out.println(eachProduct.getProdName()+":"+eachProduct.getRatePerUnit());
			
		}
		
	}
	
	public int taxPercent(Product product) {
		int tax;
		//int p=product.getProductType();
		switch(product.getProductType()) {
		
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
