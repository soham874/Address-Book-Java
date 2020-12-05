package com.adddata;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.driver.addressbookmain;

public class PatternCheck {

	public static int i;
	static Pattern pattern = null;
	static String patternNameCityState = "^[A-Z]{1}[a-z]{2,}.*$";
	static String patternAddress = "^.{10,}$";
	static String patternZIP = "^[0-9]{6}$";
	static String patternPhone = "^[0-9]{10}$";

	public static void patterncheck(String input, int flag1) throws IOException {
		
		switch (flag1) {
		case 0,2,3:
			pattern = Pattern.compile(patternNameCityState, Pattern.MULTILINE);
			break;
		case 1:
			pattern = Pattern.compile(patternAddress, Pattern.MULTILINE);
			break;
		case 4:
			pattern = Pattern.compile(patternPhone, Pattern.MULTILINE);
			break;
		case 5:
			pattern = Pattern.compile(patternZIP, Pattern.MULTILINE);
			break;
		}

		final Matcher matcher = pattern.matcher(input);

		if (matcher.find()) {
			Person.entryInfo[i] = input;
			i++;
		} else {
			System.out.println("Error in input. Please start over again.");
			addressbookmain.InitMenu();
			i = 0;
		}
	}
}