package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class AirField {
	private List<Jet> jets;
	
	
	public void airfield() {
		 jets = new ArrayList<>();
		 loadFile();
	}
	
	public void loadFile() {
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt")) ) {
			  String line;
			  while ((line = bufIn.readLine()) != null) {
			    System.out.println(line);
			  }
			}
			catch (IOException e) {
			  System.err.println(e);
			}
		
	} // end of loadFile
	
	
	
	
	
}
