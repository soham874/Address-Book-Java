package com.deletedata;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.driver.Initialize;
import com.driver.addressbookmain;

public class DeleteDataMenu {

	public static void deleteentry() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you sure you want to delete all data? Enter 1 to verify");
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice == 1) {
			PrintWriter writer = new PrintWriter(addressbookmain.filename);
			writer.print("");
			writer.close();
			System.out.println("Address book cleared.");
			Initialize.initiate();
		} else
			System.out.println("Operation aborted.");
	}

	public static void deletemenu() throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "### View menu ###");
		System.out.println("Enter choice.");
		System.out.println("<1> Delete records for a particular person.");
		System.out.println("<2> Delete all records.");
		System.out.println("<3> Edit records for a particular person.");
		System.out.println("<4> Back to main menu");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			System.out.println("Please enter name of person.");
			String check = sc.nextLine();
			DeletePerson.deletesingle(check);
			break;
		case 2:
			deleteentry();
			break;
		case 3:
			System.out.println("Please enter name of person.");
			String check1 = sc.nextLine();
			EditPerson.editsingle(check1);
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