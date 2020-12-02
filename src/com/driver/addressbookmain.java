package com.driver;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class addressbookmain {
	public static String filename;

	public static void main(String[] args) throws IOException {

		Initialize obj = new Initialize();

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Address Book!!\n");

		System.out.println("Enter the filename. Please note that it must be placed in the main project folder. : - ");
		filename = sc.nextLine();
		//filename="file";
		File tmpDir = new File(filename);
		boolean exists = tmpDir.exists();

		if (exists) {
			obj.initialzie();
			System.out.println("Data from required file loaded successfully.");
		} else {
			tmpDir.createNewFile();
			System.out.println("File does not exist. New address book created.");
		}
	sc.close();
	}
}