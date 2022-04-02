package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;




public class AirField {
	private List<Jet> jets;
	
	
	public AirField() {
		 jets = new ArrayList<>();
		 this.loadFile();
		 
	}
	
	public List<Jet> loadFile() {
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
			  String line;
			  while ((line = bufIn.readLine()) != null) {
				  String[] nl = line.split(",");
				  String type = nl[0];
				  String model = nl[1];
				  double speed = Double.parseDouble(nl[2]);
				  int range = Integer.parseInt(nl[3]);
				  long price = Long.parseLong(nl[4]);
				  
				  if(type.contains("PassengerJet")) {
					  Jet a = new PassengerJet(model, speed, range, price);
					  jets.add(a);
				  }
				  else if(type.contains("FighterJet")) {
					  Jet b = new FighterJet(model, speed, range, price);
					  jets.add(b);
				  }
				  else if(type.contains("CargoPlane")) {
					  Jet c = new CargoPlane(model, speed, range, price);
					  jets.add(c);
				  }
				  else {
					  Jet d = new JetImpl(model, speed, range, price);
				  }
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		return jets;
	} // end of loadFile
	
	public void displayJets() {
		
		for(int i = 0; i < jets.size(); i++ ) {
			Jet printObject = jets.get(i);
			System.out.println(printObject.toString());
		}
		System.out.println();
	}
	
	
	public void flyFleet() {
		
		for (Jet jet : jets) {
			jet.fly();
		}
		System.out.println();
	} // end of fly fleet
	
	
	public void fastestJet() {
		double max = 0.0;
		int index = 0;
		
		for(int i = 0; i < jets.size(); i++) {
			if(jets.get(i).getSpeed() > max) {
				max = jets.get(i).getSpeed();
				index = i;
			}
		}
		Jet fastest = jets.get(index);
		
		System.out.println("The Fastest jet is the " + fastest.getModel() + " with a speed of " + fastest.getSpeed() + " mph");
		System.out.println();
	}// end of fastest 
	
	public void longestRange() {
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < jets.size(); i++) {
			if(jets.get(i).getRange() > max) {
				max = jets.get(i).getRange();
				index = i;
			}
		}
		System.out.println("The Jet with the longest range is " + jets.get(index).getModel() + " with a range of " + jets.get(index).getRange());
		System.out.println();
	}
	
	
	public void loadAllCargo() {
		for (Jet jet : jets) {
			if(jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
		System.out.println();
		
	}
	
	public void dogFight() {
		
		for (Jet jet : jets) {
			if(jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
		System.out.println();
		
	}
	
	
	public void createJet() {
		
		Scanner sc = new Scanner(System.in);
		
		String type = null, model = null;
		double speed = 0;
		int range = 0;
		long price = 0;
		boolean keepGoing = true;
		do {
			System.out.print("Are Trying to add a fighter jet, a Cargo Plane, a Passenger Jet, or a custom Jet: ");
			type = sc.nextLine();
			
			System.out.print("What is it's Model: ");
			model = sc.nextLine();
			
			
			System.out.print("How Fast does it go: ");
			while(!sc.hasNextDouble()) {
				System.out.println("Please enter a number!!!");
				System.out.println();
				System.out.print("How Fast does it go: ");
				sc.nextLine();
			}
		    speed = sc.nextDouble();
		    
		    System.out.print("How Far can it go on a single tank of fuel: ");
		    while(!sc.hasNextInt()) {
		    	System.out.println("Please Enter a valid number!!!1");
		    	System.out.print("How Far can it go on a single tank of fuel: ");
		    	sc.nextLine();
		    }
		    range = sc.nextInt();
		    
		    System.out.print("How Much does it cost: ");

		    while(!sc.hasNextLong()) {
		    	System.out.println("Error Please Input a Number!!!");
		    	System.out.print("How Much does it cost: ");
		    	sc.nextLine();
		    }
		    price = sc.nextLong();	
				
			
			if(type.toLowerCase().startsWith("passenger")) {
				Jet a = new PassengerJet(model, speed, range, price);
				jets.add(a);
			}
			else if(type.toLowerCase().startsWith("fighter")) {
				Jet b = new FighterJet(model, speed, range, price);
				jets.add(b);
			}
			else if(type.toLowerCase().startsWith("cargo")) {
				Jet c = new CargoPlane(model, speed, range, price);
				jets.add(c);
			}
			else {
				Jet d = new JetImpl(model, speed, range, price);
				jets.add(d);
			}
			keepGoing = false;
		} while(keepGoing); // end of while loop
		System.out.println();

	}
	
	public void removeJet() {
		Scanner sc = new Scanner(System.in);
		int position = 1;
		int choice = 0;
		int index = 0;
		for(int i = 0; i < jets.size(); i++) {
			Jet s = jets.get(i);
			System.out.println(position + " Model: " + s.getModel() + " Speed: " + s.getPrice() + " Range: " + s.getRange() + " Price: " + s.getPrice());
			position++;
		}
		System.out.print("Please Enter the number of the jet to remove: ");
		choice = sc.nextInt();
		index = choice-1;
		jets.remove(index);
		displayJets();
		System.out.println();
	}
	
	
	
	
	
}// TODO
