package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void fight() {
		
		System.out.println("The " + this.getModel() + " is engageing in combat " );
		
	}

	@Override
	public void fly() {
		System.out.println("This " + this.getModel() + " can fly at " + this.getSpeed() + " mph and can travel " + this.getRange() + " miles.");
		
	}

}
