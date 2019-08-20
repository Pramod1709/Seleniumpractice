package com.Vehicles.Oops;

import java.lang.reflect.Method;

public interface Vehicle {

	public void getModelNo();
	public void getChasisNo();
	public void getPrice();
	public void getDriveType();
	
	public default void vehicleInterfaceInfo() {
		System.out.println("No. Of Methods : " + Vehicle.class.getMethods().length);
		System.out.println("Methods are : ");
		for(Method method : Vehicle.class.getMethods()) {
			System.out.println(method.getName());
		}
	}
	
	public static void vehicleDetails() {
		System.out.println("Vehicle should contain Model number");
		System.out.println("Vehicle should contain Chasis number");
		System.out.println("Vehicle should contain Drive Type e.g.4 wheel drive, front wheel drive etc.");
	}
}
