package com.driver;

import java.io.IOException;

public class NameSearch {

	public static void namecheck(String name, int marker) throws IOException {

		int flag = 0;
		for (int i = 0; i <= Initialize.lines - 1; i++) {

			if (name.equals(Initialize.fullnames[i])) {
				System.out.println(Initialize.fullnames[i]);
				System.out.println('\n' + "Following record found~~~~~~~~~~~~~~~");
				System.out.println(name);
				System.out.println(Initialize.address + "," + Initialize.city);
				System.out.println(Initialize.state + "-" + Initialize.ZIP);
				System.out.println("Phone : " + Initialize.Phone);
				flag = 1;

			}

		}

		if (flag == 0) {
			System.out.println("Sorry. Record for this person does not exist.");
			addressbookmain.InitMenu();
		} else {

		}

	}
}
