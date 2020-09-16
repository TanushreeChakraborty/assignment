package com.training1;

public class VehicleInsurance extends Insurance {
	
	private String vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
	
	
	
	public VehicleInsurance(String vehicleModel, int yearOfManufacture, double costOfVehicle) {
		super();
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}

	

	public String getVehicleModel() {
		return vehicleModel;
	}



	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}



	public int getYearOfManufacture() {
		return yearOfManufacture;
	}



	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}



	public double getCostOfVehicle() {
		return costOfVehicle;
	}



	public void setCostOfVehicle(double costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}



	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		//return super.calculatePremium(policyHolderAge, insuredAmount);
		
		double premium;
		if(vehicleModel=="two wheeler premium"&& yearOfManufacture<2)
		premium=0.6*insuredAmount;
		else if(vehicleModel=="four wheeler premium"&& yearOfManufacture<2)
			premium=0.4*insuredAmount;
		else
			premium=0.5*insuredAmount;
		return premium;
	}
	
	

}
