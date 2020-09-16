package com.training1;

public class Product extends Object {
 
	private int prodId;
	private String prodName;
	 private double ratePerUnit;
	 private int productType;
	 private int quantity;
	 private double discount;
 
	 public Product(int prodId, String prodName, double ratePerUnit, int productType, int quantity, double discount) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.ratePerUnit = ratePerUnit;
		this.productType = productType;
		this.quantity = quantity;
		this.discount = discount;
	}


public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
 
 
public Product(int prodId, String prodName, double ratePerUnit, int productType) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.ratePerUnit = ratePerUnit;
	this.productType = productType;
}


public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public double getRatePerUnit() {
	return ratePerUnit;
}
public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}
public int getProductType() {
	return productType;
}
public void setProductType(int productType) {
	this.productType = productType;
}
 
 
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}


@Override
	public String toString() {
	// TODO Auto-generated method stub
	return this.prodName+":"+this.ratePerUnit;
}
 


}
