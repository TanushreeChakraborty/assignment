package com.training1;

public class Product {
 
	private int prodId;
	private String prodName;
	 private double ratePerUnit;
	 private int productType;
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
 
 

}
