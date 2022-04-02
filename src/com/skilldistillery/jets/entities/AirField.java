package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




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
				  else {
					  Jet c = new CargoPlane(model, speed, range, price);
					  jets.add(c);
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
			if(jet instanceof FighterJet) {
				jet.fly();
			}
			if(jet instanceof PassengerJet) {
				jet.fly();
			}
			if(jet instanceof CargoPlane) {
				jet.fly();
			}
		}
		System.out.println();
	} // end of flyfleet
	
	
	public void fastestJet() {
		double max = 0.0;
		int index = 0;
		
		for(int i = 0; i < jets.size(); i++) {
			if(jets.get(i).getSpeed() > max) {
				max = jets.get(i).getSpeed();
				index = i;
			}
		}
		System.out.println(jets.get(index).toString());
		
	}// end of fastest 
	
	
	
	
	
	
	
	
}
