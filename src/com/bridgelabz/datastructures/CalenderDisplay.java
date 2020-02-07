package com.bridgelabz.datastructures;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/**
 * @author Arvind 
 * Date: 3/12/2019 
 * purpose: program to display the calendar month wise
 */

public class CalenderDisplay {
	public static void myCalendar(int m, int y) {

		int d = 1;
		int month = m;
		int year = y;

		if (m > 12 || y < 1582 || m < 1) {
			System.out.println("invalid month and day");
			return;
		}

		System.out.println("Java Calendar " + month + "  " + year);

		y = y - (14 - m) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		m = m + 12 * ((14 - m) / 12) - 2;
		d = (d + x + 31 * m / 12) % 7;

		switch (month) {

		case 1:
			System.out.print("January  ");
			break;
		case 2:
			System.out.print("February  ");
			break;
		case 3:
			System.out.print("March  ");
			break;
		case 4:
			System.out.print("April  ");
			break;
		case 5:
			System.out.print("May  ");
			break;
		case 6:
			System.out.print("June  ");
			break;
		case 7:
			System.out.print("July  ");
			break;
		case 8:
			System.out.print("August  ");
			break;
		case 9:
			System.out.print("September  ");
			break;
		case 10:
			System.out.print("October  ");
			break;
		case 11:
			System.out.print("November  ");
			break;
		case 12:
			System.out.print("December  ");
			break;
		default:
			System.out.println("invalid date");
		}
		System.out.println(y);

		switch (d) {
		case 0: {
			// System.out.println("Sunday ");
			displayCalendar(month, year, 0);
		}
			break;
		case 1: {
			// System.out.println("Monday ");
			displayCalendar(month, year, 1);
		}
			break;
		case 2: {
			// System.out.println("Tuesday ");
			displayCalendar(month, year, 2);
		}
			break;
		case 3: {
			// System.out.println("Wednsday ");
			displayCalendar(month, year, 3);
		}
			break;
		case 4: {
			// System.out.println("Thursday ");
			displayCalendar(month, year, 4);
		}
			break;
		case 5: {
			// System.out.println("Friday ");
			displayCalendar(month, year, 5);
		}
			break;
		case 6: {
			// System.out.println("Saturday ");
			displayCalendar(month, year, 6);
		}
			break;
		default:
			System.out.print("invalid date ");

		}
	}

	// Method for converted in String array
	public static String[][] input(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "";
			}
		}
		return arr;
	}

	public static String[][] displayCalendar(int month, int year, int index) {

		int dayofMonth = 31;
		// Checking for leap year
		if (month == 2) {
			Utility.isLeapYear(year);
			dayofMonth = 28;
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			dayofMonth = 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			dayofMonth = 30;
		} else {
			dayofMonth = 29;
		}

		String weekArr[] = { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };
		for (int i = 0; i < weekArr.length; i++) {
			System.out.print(weekArr[i] + "\t");
		}
		System.out.println();

		String cal[][] = new String[7][7];
		String cal1[][] = input(cal);

		int num = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j >= index) {
					cal1[i][j] = Integer.toString(num);
					num++;
				}
				if (i > 0) {

					cal1[i][j] = Integer.toString(num);
					num++;
					if (num > dayofMonth)
						break;
				}
			}

		}

		for (int i = 0; i < cal1.length; i++) {
			for (int j = 0; j < cal1.length; j++) {
				System.out.print(cal1[i][j] + "\t");
			}
			System.out.println();
		}
		return cal1;
	}

	public static void main(String[] args) {
		System.out.print("Eneter the value of month : ");
		int month = InputUtility.nextInt();
		System.out.print("Eneter the value of year : ");
		int year = InputUtility.nextInt();
		myCalendar(month, year);

	}

}