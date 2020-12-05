package com.driver;

import java.io.IOException;

public class NameSearch {
	
	public static String[] editInfo= new String[6]; 

	public static int namecheck(String name, int marker) throws IOException {
		int flag = 0;
		int pos = -1;
		for (int i = 0; i <= Initialize.lines - 1; i++) {
			if (name.compareTo(Initialize.fullnames[i]) == 0) {
				System.out.println('\n' + "Following record found~~~~~~~~~~~~~~~");
				System.out.println(name);
				System.out.println(Initialize.address[i] + ", " + Initialize.city[i]);
				System.out.println(Initialize.state[i] + "-" + Initialize.ZIP[i]);
				System.out.println("Phone : " + Initialize.Phone[i]);
				pos = i;
				flag = 1;
			}

		}

		if (flag == 0) {
			System.out.println("Sorry. Record for this person does not exist.");
			addressbookmain.InitMenu();	
		} else { 
			if (marker == 1) 
				return pos;
			if (marker == 2) {
				
				editInfo[0] = Initialize.fullnames[pos];
				editInfo[1] = Initialize.address[pos];
				editInfo[2] = Initialize.city[pos];
				editInfo[3] = Initialize.state[pos];
				editInfo[4] = Initialize.Phone[pos];
				editInfo[5] = Initialize.ZIP[pos];
								
				return pos;
			}
		}
		return 0;
	}
}
