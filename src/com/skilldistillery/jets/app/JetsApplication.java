package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication japp = new JetsApplication();
		
		
		japp.launch();
		
			

	}
	
	private void launch() {
		
		displayUserMenu();
		
		
		
	}
	
	
	private void displayUserMenu() {
		
		Scanner sc = new Scanner(System.in);
		AirField af = new AirField();
		boolean mainLoop = true;
		int choice;
		
		while(mainLoop) {
			System.out.println("Fleet Management Main Menu\n");
			System.out.print("1.) List fleet \n");
			System.out.print("2.) Fly All jets \n");
			System.out.print("3.) View fastest jet \n");
			System.out.print("4.) View jet with longest range \n");
			System.out.print("5.) Load all Cargo Jets \n");
			System.out.print("6.) Dogfight! \n");
			System.out.print("7.) Add a jet to Fleet \n");
			System.out.print("8.) Remove a jet from Flett \n");
			System.out.print("9.) Quit \n");
			System.out.print("Enter your Menu Choice: ");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				// TODO Add Method for listing jets
				af.displayJets();
				break;
			
			case 2:
				//TODO add Method for flying all jets
				
				break;
				
				
			case 3:
				
				//TODO add method for viewing the jet with the fastest speed 
				
				
				break;
			
			
			case 4: 
				//TODO add Method that returns jet with longest range 
				
				
				break;
				
				
				
			case 5:
				
				// TODO method to load all cargo jets
				
				
				break;
				
				
			case 6:
				
				
				
				// Method to send all fighter jets on a dog fight
			
				break;
				
				
			case 7:
				String type, model;
				double speed;
				int range;
				long price;
			
				System.out.print("Are Trying to add a fighter jet, a Cargo Plane, or a Passenger Jet: ");
				type = sc.nextLine();
				System.out.print("What is it's Model: ");
				model = sc.nextLine();
				System.out.print("How Fast does it go: ");
				speed = sc.nextDouble();
				System.out.print("How Far can it go on a single tank of fuel: ");
				range = sc.nextInt();
				System.out.print("How Much does it cost: ");
				price = sc.nextLong();
				
				if(type.toLowerCase().startsWith("passenger")) {
					Jet a = new PassengerJet(model, speed, range, price);
					// TODO create add method for af instance
				}
				else if(type.toLowerCase().startsWith("fighter")) {
					Jet b = new FighterJet(model, speed, range, price);
					// TODO add method 
				}
				else {
					Jet c = new CargoPlane(model, speed, range, price);
					// TODO add Method
				}
				
				break;
			
			case 8:
				int removePlane;
				
				// TODO add the planes list
				System.out.println("Which plane do you want to remove: ");
				removePlane = sc.nextInt();
				//TODO add a plane remover based on index;
				
				break;
				
			case 9: 
				
				System.out.println("Exting Application ..... ");
				//TODO method to save planes to file
				
				System.exit(0);
				break;
			default : 
				System.out.println("NOT A VALID CHOICE TRY ONE OF THE MENU OPTIONS!!!");
				break;
			
			
			} // end of switch case 
			
			
			
		} // end of while loop
		
		
		
		
	}
	
	
	

}
