package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

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
			System.out.print("8.) Remove a jet from Fleet \n");
			System.out.print("9.) Quit \n");
			System.out.print("Enter your Menu Choice: ");
			
			choice = sc.nextInt();
			System.out.println();
			
			switch(choice) {
			
			case 1:
				af.displayJets();
				break;
			
			case 2:
				af.flyFleet();
				break;
				
			case 3:				
				af.fastestJet();
				break;
				
			case 4: 
				af.longestRange();
				break;
					
			case 5:
				af.loadAllCargo();	
				break;
				
			case 6:
				af.dogFight();
				break;
				
			case 7:
				af.createJet();
				break;
			
			case 8:
				af.removeJet();
				
				break;
				
			case 9: 
				
				System.out.println("Exting Application ..... ");
				sc.close();
				System.exit(0);
				break;
				
			default : 
				System.out.println("NOT A VALID CHOICE TRY ONE OF THE MENU OPTIONS!!!");
				break;
			
			
			} // end of switch case 
			
			
			
		} // end of while loop
		
		
		
		
	}
	
	
	

}
