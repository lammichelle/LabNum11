package com.car;

public class Car {
	private int num;
	private String make;
	private String model;
	private int year;
	private double price;

	public Car() {
		super();
	}

	// constructor
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	// getters and setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// override
	@Override
	public String toString() {

		return String.format("Make: %-10s Model: %-10s Year: %-10s" + "Price: $ %-10s", make, model, year, price);
		// return "Car [make=" + make + ", model=" + model + ", year=" + year + ",
		// price=" + price + "]";
	}

}
