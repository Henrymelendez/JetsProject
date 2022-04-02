package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	
	
	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	
	}

	@Override
	public void fly() {
		
		System.out.println("This " + this.getModel() + " can fly at " + this.getSpeed() + " mph and can travel " + this.getRange() + " miles." );
		
	}

}
