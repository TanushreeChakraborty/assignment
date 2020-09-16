package com.training1;

public class Application_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Insurance insurance=new Insurance(2, "tanu", 23, 500);
		VehicleInsurance vehicleInsurance=new VehicleInsurance("two wheeler premium", 1, 500);
		System.out.println(insurance.calculatePremium());
		System.out.println(vehicleInsurance.calculatePremium());
		

	}

}
