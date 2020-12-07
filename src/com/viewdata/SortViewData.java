package com.viewdata;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.driver.Initialize;

public class SortViewData {

	public void acceptOrder() throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "Enter 1 to sort in ascending and 2 to sort in descending");
		int order = sc.nextInt();
		System.out.println("Enter 1 to sort by Last name and 2 to sort by ZIP");
		int column = sc.nextInt();
		sort(column, order);

	}

	public void sort(int column, int order) throws IOException {

		String[] sortArray = new String[Initialize.lines];

		if (column == 1)
			for (int i = 0; i < Initialize.lines; i++) {
				sortArray[i] = Initialize.Lastname[i];
			}
		else
			for (int i = 0; i < Initialize.lines; i++) {
				sortArray[i] = Initialize.ZIP[i];
			}

		int[] arraySortOrder = new int[Initialize.lines];
		for (int i = 0; i < Initialize.lines; i++) {
			arraySortOrder[i] = i;
		}

		for (int i = 0; i < Initialize.lines - 1; i++) {
			for (int j = i + 1; j < Initialize.lines; j++) {
				if ((sortArray[i].compareTo(sortArray[j]) > 0 && order == 1)
						|| (sortArray[i].compareTo(sortArray[j]) < 0 && order == 2)) {
					String temp = sortArray[i];
					sortArray[i] = sortArray[j];
					sortArray[j] = temp;

					int temp2 = arraySortOrder[i];
					arraySortOrder[i] = arraySortOrder[j];
					arraySortOrder[j] = temp2;
				}
			}
		}
		
		System.out.println('\n');
		for (int i = 0; i < Initialize.lines; i++) {
			System.out.printf("%-30s%-50s%-20s%-20s%s\t%s\n", Initialize.fullnames[arraySortOrder[i]],
					Initialize.address[arraySortOrder[i]], Initialize.city[arraySortOrder[i]],
					Initialize.state[arraySortOrder[i]], Initialize.Phone[arraySortOrder[i]],
					Initialize.ZIP[arraySortOrder[i]]);
		}

		ViewMainMenu obj = new ViewMainMenu();
		obj.viewmenu();

		Arrays.fill(sortArray, null);
		Arrays.fill(arraySortOrder, 0);
	}
}