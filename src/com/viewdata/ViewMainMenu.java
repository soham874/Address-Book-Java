package com.viewdata;

import java.io.IOException;
import java.util.Scanner;

import com.driver.NameSearch;
import com.driver.addressbookmain;

public class ViewMainMenu {

	public void viewmenu() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println('\n'+"### View menu ###");
		System.out.println("Enter choice.");
		System.out.println("<1> View records for a particular person.");
		System.out.println("<2> View all records sorted in ascending or descending.");
		System.out.println("<3> Back to main menu");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Please enter name of person.");
			String check = sc.nextLine();
			NameSearch.namecheck(check,0);
			break;
		case 2:
			SortViewData view = new SortViewData();
			view.acceptOrder();
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