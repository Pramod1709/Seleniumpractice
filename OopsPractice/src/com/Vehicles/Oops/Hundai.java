package com.Vehicles.Oops;

public class Hundai extends Car{

	String carType; 
	String carModel;
	String modelNo;
	long chasisNo;
	int price;
	String driveType;
	int seatCapacity;
	int fuelTankCapacity;
	
	public Hundai(String carType, String carModel, String modelNo, long chasisNo, int price, String driveType,
			int seatCapacity, int fuelTankCapacity) {
		this.carType = carType;
		this.carModel = carModel;
		this.modelNo = modelNo;
		this.chasisNo = chasisNo;
		this.price = price;
		this.driveType = driveType;
		this.seatCapacity = seatCapacity;
		this.fuelTankCapacity = fuelTankCapacity;
	}

	@Override
	public void getModelNo() {
		System.out.println("Model No. " + modelNo);
	}

	@Override
	public void getChasisNo() {
		System.out.println("Chasis No. " + chasisNo);
	}

	@Override
	public void getPrice() {
		System.out.println("Price : " + price);
	}

	@Override
	public void getDriveType() {
		System.out.println("Type of drive : " + driveType);
	}

	@Override
	public void seatCapacity() {
		System.out.println("No. of Seats : " + seatCapacity);
	}

	@Override
	public void fuelTankCapacity() {
		System.out.println("Fuel tank Capacity : " + fuelTankCapacity + "Ltr.");
	}

	@Override
	public String getCarType() {
		return carType;
	}
	
	@Override
	public String getCarModel() {
		return carModel;
	}
	
	@Override
	public String toString() {
		return "Hundai [Car Type : " + carType + ", Car Model : " + carModel + ", Model No : " + modelNo + ", Chasis No : "
				+ chasisNo + ", Price : " + price + ", Type of drive : " + driveType + ", No. of Seats : " + seatCapacity
				+ ", Fuel tank Capacity : " + fuelTankCapacity + "Ltr.]";
	}
	
	
}
