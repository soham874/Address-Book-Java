package com.driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Initialize {
	public static int lines = 0;
	public static String[] fullnames = new String[100];
	public static String[] address = new String[100];
	public static String[] city = new String[100];
	public static String[] state = new String[100];
	public static String[] ZIP = new String[100];
	public static String[] Phone = new String[100];
	public static String[] Lastname = new String[100];

	public static void initiate() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(addressbookmain.filename));
		String currentLine;
		lines = 0;
		while ((currentLine = br.readLine()) != null) {

			String[] addressdata = currentLine.split(";");
			// System.out.println(addressdata[0] + " " + addressdata[1] + " " +
			// addressdata[2]);

			fullnames[lines] = addressdata[0] + " " + addressdata[1];
			Lastname[lines] = addressdata[1];
			address[lines] = addressdata[2];
			city[lines] = addressdata[3];
			state[lines] = addressdata[4];
			ZIP[lines] = addressdata[6];
			Phone[lines] = addressdata[5];

			lines++;
		}

		br.close();
	}
}