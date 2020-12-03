package com.viewdata;

import java.io.IOException;
import java.util.Scanner;

import com.driver.Initialize;

public class SortViewData {
	
	public void acceptOrder() throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to sort in ascending and 2 to sort in descending");
		int order = sc.nextInt();
		System.out.println("Enter 1 to sort by Last name and 2 to sort by ZIP");
		int column = sc.nextInt();
		sort(column, order);
		
		sc.close();
	}

	public void sort(int column, int order) throws IOException {
		
		String[] sortArray;
					
		if (column == 1) 
			sortArray = Initialize.Lastname;
		else 
			sortArray = Initialize.ZIP;
		
		int[] arraySortOrder = new int[Initialize.lines];
		for (int i=0; i<Initialize.lines;i++) {
			arraySortOrder[i] = i;
		}
		
		for (int i=0;i<Initialize.lines;i++) {
			for (int j=0;j<Initialize.lines;j++) {		
				if ( (sortArray[i].compareTo(sortArray[j]) > 0 && order == 1) || (sortArray[i].compareTo(sortArray[j]) < 0 && order == 2) ) {
					String temp = sortArray[i];
					sortArray[j] = sortArray[i];
					sortArray[i] = temp;
					
					int temp2 = arraySortOrder[j];
					arraySortOrder[j] = arraySortOrder[i];
					arraySortOrder[i] = temp2;
				}
			}
		}
		
		for (int i=0;i<Initialize.lines;i++) {
			System.out.printf("%-30s%-50s%-20s%-20s%s\t%s\n",Initialize.fullnames[arraySortOrder[i]],Initialize.address[arraySortOrder[i]],Initialize.city[arraySortOrder[i]],Initialize.state[arraySortOrder[i]],Initialize.Phone[arraySortOrder[i]],Initialize.ZIP[arraySortOrder[i]]);
		}
		
		ViewMainMenu obj = new ViewMainMenu();
		obj.viewmenu();
	}
}
