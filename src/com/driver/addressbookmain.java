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
		//filename = sc.nextLine();
		filename="file";
		File tmpDir = new File(filename);
		boolean exists = tmpDir.exists();

		if (exists) {
			obj.initialzie();
			System.out.println("Number of lines in file = " + Initialize.lines);
		} else {
			System.out.println("Does not exist.");
		}
		
/*		for (int i=0; i<Initialize.lines ; i++) {
			System.out.println("Name "+(i+1)+" is "+Initialize.fullnames[i]);
		}
*/		sc.close();
	}
}