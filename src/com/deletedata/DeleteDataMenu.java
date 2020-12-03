package com.deletedata;

import java.io.IOException;
import java.util.Scanner;

import com.driver.addressbookmain;

public class DeleteDataMenu {

	public void deletemenu() throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "### View menu ###");
		System.out.println("Enter choice.");
		System.out.println("<1> Delete records for a particular person.");
		System.out.println("<2> Edit records for a particular person.");
		System.out.println("<3> Delete all records.");
		System.out.println("<4> Back to main menu");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:
			addressbookmain.InitMenu();
			break;
		default:
			System.out.println("Sorry wrong choice. Please try again.");
			deletemenu();
		}
	}
}