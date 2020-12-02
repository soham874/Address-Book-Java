package com.adddata;

import java.io.IOException;

import com.driver.Initialize;
import com.driver.addressbookmain;

public class Verify {
	
	public void dupliucate(String check) throws IOException {
		
		for (int i=0;i<=Initialize.lines-1;i++) {
			if (check.equals(Initialize.fullnames[i])) {
				System.out.println("Record for this person already exists in the address book.");
				addressbookmain.InitMenu();
			}
				
		}
	}
}