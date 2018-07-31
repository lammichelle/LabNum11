package com.car;

public class UsedCar extends Car{
	
	private double mileage;
	private int num;
	
	public UsedCar() {
		super();
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage; 
		//for every new input in the constructor , must add this statement
	}

	@Override
	public String toString() {
		
		
		
		//return "UsedCar [dataMember=" + dataMember + "]";
		return  super.toString() + " " + String.format("Mileage: $ %-10s", mileage);
	}


	

}
