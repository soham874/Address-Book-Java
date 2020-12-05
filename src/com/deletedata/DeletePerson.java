package com.deletedata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.driver.Initialize;
import com.driver.NameSearch;
import com.driver.addressbookmain;

public class DeletePerson {
	
	public static void deletoperation(int deletepos) throws IOException {
		int pos = 0;

		BufferedReader br = new BufferedReader(new FileReader(addressbookmain.filename));
		File file = new File(addressbookmain.filename);
		FileWriter writer = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(writer);
		File tmpDir = new File("temp");
		PrintWriter pw = new PrintWriter(new FileWriter(tmpDir));

		String currentLine;
		while ((currentLine = br.readLine()) != null) {
			if (pos != deletepos) {
				pw.println(currentLine);
				pw.flush();
			}
			pos++;
		}

		pw.close();
		br.close();
		bw.close();
		file.delete();
		tmpDir.renameTo(file);
		
	}

	public static void deletesingle(String input) throws IOException {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int deletepos = NameSearch.namecheck(input, 1);
		System.out.println("Do you really want to delete this persons record? Press 1 to verify");
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice == 1) {
			deletoperation(deletepos);
			System.out.println("Person's record deleted.");
			Initialize.initiate();
		} else
			System.out.println("Deleteing record aborted");

	}
}
