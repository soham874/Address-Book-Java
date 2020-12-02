package com.adddata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.driver.Initialize;
import com.driver.addressbookmain;

public class AddNewData {
	
	public static String[] entryInfo = new String [100];
	
	public void adddata() throws IOException {

		Scanner sc = new Scanner(System.in);
		PatternCheck pat = new PatternCheck();
		Initialize obj = new Initialize();
		
		File file = new File(addressbookmain.filename);
		FileWriter writer = new FileWriter(file,true); 
		BufferedWriter br = new BufferedWriter(writer);
		
		PatternCheck.i = 0;
		System.out.println("Enter persons First Name");
		pat.patterncheck(sc.nextLine(), 1);
		System.out.println("Enter persons Last Name");
		pat.patterncheck(sc.nextLine(), 1);
		System.out.println("Enter persons Address");
		pat.patterncheck(sc.nextLine(), 2);
		System.out.println("Enter persons City");
		pat.patterncheck(sc.nextLine(), 1);
		System.out.println("Enter persons State");
		pat.patterncheck(sc.nextLine(), 1);
		System.out.println("Enter persons Phone number");
		pat.patterncheck(sc.nextLine(), 4);
		System.out.println("Enter persons ZIP");
		pat.patterncheck(sc.nextInt(), 3);
	
		for (int j=0;j<=6;j++) {
			if (j == 0 && Initialize.lines != 0 )
				br.write("\n");
			br.write(entryInfo[j]+";");	
		}
		
		br.flush();
		writer.close();
		obj.initiate();
		addressbookmain.InitMenu();
		sc.close();
	}
}