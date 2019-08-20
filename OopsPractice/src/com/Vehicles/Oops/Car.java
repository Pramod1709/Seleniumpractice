package com.Vehicles.Oops;

public abstract class Car implements Vehicle {

	public abstract void seatCapacity();
	public abstract void fuelTankCapacity();
	public abstract String getCarType();
	public abstract String getCarModel();
	
	public void carTypeSpecification(String carType) {
		if(carType.equals("Sedan")) {
			System.out.println("Car has extra luggage capacity");
		}else if(carType.equals("Hatch back")) {
			System.out.println("Car has limited luggage capacity");
		}else if(carType.equals("SUV")) {
			System.out.println("Car has extra luggage as well as seating capacity");
		}else {
			System.out.println("It's a compact car");
		}
	}
	
	public void carModelSpecification(String carModel) {
		if(carModel.equalsIgnoreCase("Basic")) {
			System.out.println("Basic car with no extra features");
		}else if(carModel.equalsIgnoreCase("Intermediate")) {
			System.out.println("Basic car with some extra features");
		}else if(carModel.equalsIgnoreCase("Advance")) {
			System.out.println("Advance car with all features");
		}else {
			System.out.println("It's demo car");
		}
	}
}
