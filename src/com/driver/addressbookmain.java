package com.driver;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.adddata.Person;
import com.deletedata.DeleteDataMenu;
import com.viewdata.ViewMainMenu;

public class addressbookmain {
	public static String filename;

	public static void InitMenu() throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "### Main Menu ###");
		System.out.println("Please enter your choice :- ");
		System.out.println("<1> Enter new data.");
		System.out.println("<2> View existing data.");
		System.out.println("<3> Edit existing data.");
		System.out.println("<4> Exit address book.");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			Person.adddata();
			break;
		case 2:
			ViewMainMenu view = new ViewMainMenu();
			view.viewmenu();
			break;
		case 3:
			DeleteDataMenu.deletemenu();
			break;
		case 4:
			System.out.println('\n' + "Finishing with " + Initialize.lines + " records.");
			System.out.println("Thank you for using Address book.");
			System.exit(0);
		default:
			System.out.println("Wrong choice entered. Please try again.");
		}
		InitMenu();

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Address Book!!\n");

		System.out.println("Enter the filename. Please note that it must be placed in the main project folder. : - ");
		filename = sc.nextLine();
		
		File tmpDir = new File(filename);
		boolean exists = tmpDir.exists();

		if (exists) {
			Initialize.initiate();
			System.out.println("Data from required file loaded successfully.");
		} else {
			tmpDir.createNewFile();
			System.out.println("File does not exist. New address book created.");
		}
		InitMenu();

	}
}