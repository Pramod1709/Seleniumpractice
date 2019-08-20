package com.Vehicles.Oops;

import java.util.Scanner;

public class MainApp {

	static Scanner sc = new Scanner(System.in);
	static Car car;
	
	public static void main(String[] args) {
		
		Car[] carArray = new Car[4];
		
		System.out.println("Enter car type(Hundai or Suzuki) : ");
		String typeOfCar = sc.next();
		
		if(typeOfCar.equalsIgnoreCase("Hundai")) {
			car = createHundaiObject();
		}else if(typeOfCar.equalsIgnoreCase("Suzuki")) {
			car = createSuzukiObject();
		}
		
		Vehicle.vehicleDetails();
		
		System.out.println(car);
		
		
		car.vehicleInterfaceInfo();	
		car.carTypeSpecification(car.getCarType());
		car.carModelSpecification(car.getCarModel());
		
		carArray[0]= new Suzuki("SUV", "Advance", "1456hi56", 7812454, 1300000, "4x4", 7, 30);
		carArray[1] = new Suzuki("Sedan", "Intermediate", "787hji323", 7845120, 800000, "Front Wheel Drive", 4, 20);
		carArray[2] = new Hundai("Hatch back", "Basic", "0032156gh7", 78925410, 500000, "Front Wheel Drive", 4, 18);
		carArray[3] = new Hundai("Sedan", "Intermediate", "8742ghft21", 78920023, 1000000, "4x4", 4, 19);
	
		for(Car car : carArray) {
			System.out.println(car.getClass().getName());
			System.out.println("Car Type : " + car.getCarType());
			car.getPrice();
		}
	}

	private static Suzuki createSuzukiObject() {
		Car sCross = new Suzuki("Sedan", "Advance", "123ScSedan", 87956302, 1300000, "Front Wheel Drive", 4, 20);
		return (Suzuki) sCross;
		
	}

	private static Hundai createHundaiObject() {
		Car i20 = new Hundai("Hatch back", "Intermediate", "Sportz20", 563002, 800000, "Front Wheel Drive", 4, 18);
		return (Hundai) i20;
	}
}
