package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier {
	
	
	
	

	
	public CargoPlane() {
		
	}
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	
	
	
	
	
	
	

	@Override
	public void fly() {
		System.out.println("This " + this.getModel() + " can fly at " + this.getSpeed() + " mph and can travel " + this.getRange() + " miles");
		
		
	}



	@Override
	public void loadCargo() {
		 
		System.out.println("The " + this.getModel() + " is getting loaded.");
		
	}
	
	
	
	
	
	
	
	
}
