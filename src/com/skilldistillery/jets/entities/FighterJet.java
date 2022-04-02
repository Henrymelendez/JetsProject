package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("This " + this.getModel() + " can fly at " + this.getSpeed() + " mph and can travel " + this.getRange() + " miles.");
		
	}

}
