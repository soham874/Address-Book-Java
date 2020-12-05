package com.adddata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.driver.Initialize;
import com.driver.addressbookmain;

public class Person {

	public static String[] entryInfo = new String[100];

	public static void adddata() throws IOException {

		Scanner sc = new Scanner(System.in);
		Verify name = new Verify();

		File file = new File(addressbookmain.filename);
		FileWriter writer = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(writer);

		PatternCheck.i = 0;
		System.out.println('\n' + "### Enter New Data ###");
		System.out.println("Enter persons First Name");
		PatternCheck.patterncheck(sc.nextLine(), 0);
		System.out.println("Enter persons Last Name");
		PatternCheck.patterncheck(sc.nextLine(), 0);
		name.dupliucate(entryInfo[0] + " " + entryInfo[1]);
		System.out.println("Enter persons Address");
		PatternCheck.patterncheck(sc.nextLine(), 1);
		System.out.println("Enter persons City");
		PatternCheck.patterncheck(sc.nextLine(), 2);
		System.out.println("Enter persons State");
		PatternCheck.patterncheck(sc.nextLine(), 3);
		System.out.println("Enter persons Phone number");
		PatternCheck.patterncheck(sc.nextLine(), 4);
		System.out.println("Enter persons ZIP");
		PatternCheck.patterncheck(sc.nextLine(), 5);

		for (int j = 0; j <= 6; j++) {
			br.write(entryInfo[j] + ";");
		}
		System.out.println("###   New data entry successful.   ###");
		br.flush();
		writer.close();
		Initialize.initiate();
		addressbookmain.InitMenu();
		sc.close();
	}
}