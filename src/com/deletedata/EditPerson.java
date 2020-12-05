package com.deletedata;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.adddata.PatternCheck;
import com.driver.Initialize;
import com.driver.NameSearch;
import com.driver.addressbookmain;

public class EditPerson {

	public static void editsingle(String input) throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int deletepos = NameSearch.namecheck(input, 2);
		System.out.println("Do you really want to edit this persons record? Press 1 to verify");
		int choice = sc.nextInt();
		sc.nextLine();

		if (choice == 1) {

			System.out.println('\n'
					+ "Name cannot be changed. Other than that, select wheich information you want to change. Enter 0 when done");
			int flag = 0;
			while (flag == 0) {
				System.out.println("<1> Address <2> City <3> State <4> Phone <5> ZIP <0> Finalize changes");
				int change = sc.nextInt();
				sc.nextLine();

				if (change >= 1 && change <= 5) {
					System.out.println("Enter new Data : ");
					NameSearch.editInfo[change] = sc.nextLine();
					PatternCheck.patterncheck(NameSearch.editInfo[change], change);
				} else
					flag = 1;
			}
			DeletePerson.deletoperation(deletepos);

			File file = new File(addressbookmain.filename);
			FileWriter writer = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(writer);

			String nameparts[] = input.split(" ");

			for (int j = 1; j <= 5; j++) {
				if (j == 1)
					br.write(nameparts[1] + ";" + nameparts[2] + ";");
				br.write(NameSearch.editInfo[j] + ";");
			}

			br.flush();
			br.close();
			Initialize.initiate();
			// System.out.println(Arrays.toString(NameSearch.editInfo));
			// All verified data is in NameSearch.editInfo

		} else
			System.out.println("Editing record aborted");

	}
}