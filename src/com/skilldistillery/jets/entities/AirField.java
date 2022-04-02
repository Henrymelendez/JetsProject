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
					  jets.add(c)
;				  }
				  
				  
				  
				  
				  
			    
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		return jets;
	
		
	} // end of loadFile
	
	
	
	
	
	
	
}
