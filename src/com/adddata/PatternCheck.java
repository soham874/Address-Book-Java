package com.adddata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.driver.addressbookmain;

public class PatternCheck {

	public static int i;
	Pattern pattern = null;
	String patternNameCityState = "^[A-Z]{1}[a-z]{2,}$";
	String patternAddress = "^.{10,}$";
	String patternZIP = "^[A-Z]{1}[a-z]{2,}$";
	String patternPhone = "^.{10,}$";

	public void patterncheck(String input, int flag1) {

		switch (flag1) {
		case 1:
			pattern = Pattern.compile(patternNameCityState, Pattern.MULTILINE);
			break;
		case 2:
			pattern = Pattern.compile(patternAddress, Pattern.MULTILINE);
		}

		final Matcher matcher = pattern.matcher(input);

		if (matcher.find()) {
			AddNewData.entryInfo[i] = input;
			i++;
		} else {
			System.out.println("Error in input. Please start over again.");
			addressbookmain.InitMenu();
			i = 0;
		}
	}

	public void patterncheck(int input, int flag1) {

		switch (flag1) {
		case 3:
			pattern = Pattern.compile(patternZIP, Pattern.MULTILINE);
			break;
		case 4:
			pattern = Pattern.compile(patternPhone, Pattern.MULTILINE);
		}

		final Matcher matcher = pattern.matcher(Integer.toString(input));

		if (matcher.find()) {
			AddNewData.entryInfo[i] = Integer.toString(input);
			i++;
		} else {
			System.out.println("Error in input. Please start over again.");
			addressbookmain.InitMenu();
			i = 0;
		}
	}

}