package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {
	
	
	
	

	
	public CargoPlane() {
		
	}
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	
	
	
	
	
	
	

	@Override
	public void fly() {
		System.out.println("Start the cargo plane ");
		
	}



	@Override
	public void loadCargo() {
		// TODO add method from user Stories 
		
	}
	
	
	
	
	
	
	
	
}
