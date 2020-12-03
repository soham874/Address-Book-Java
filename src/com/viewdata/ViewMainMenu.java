package com.viewdata;

import java.io.IOException;
import java.util.Scanner;

import com.driver.addressbookmain;

public class ViewMainMenu {

	public void viewmenu() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println('\n'+"### View menu ###");
		System.out.println("Enter choice.");
		System.out.println("<1> View records for a particular person.");
		System.out.println("<2> View all records sorted in scending or descending.");
		System.out.println("<3> Back to main menu");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			addressbookmain.InitMenu();
			break;
		default:
			System.out.println("Sorry wrong choice. Please try again.");
			viewmenu();
		}
	}
}