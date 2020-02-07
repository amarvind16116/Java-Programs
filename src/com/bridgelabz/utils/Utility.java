package com.bridgelabz.utils;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to write the reuse business logics
 */

public class Utility {
	private Utility() {
		// TODO Auto-generated constructor stub
	}

	public static String[] readlinearray(int len) throws NumberFormatException, IOException {
		String[] arr = new String[len];
		for (int i = 0; i < len; i++)
			arr[i] = InputUtility.nextString();
		return arr;
	}
	// private static final Scanner scanner = new Scanner(System.in);
	// public static char nextChar(){
	// return (char)scanner.next().charAt(0);
	// }

	// binary search using integer
	public static int binarySearchInt(int[] a, int beg, int end, int item) {
		int mid = 0;
		if (end >= beg) {
			mid = (beg + end) / 2;
			if (a[mid] == item) {
				return mid + 1;
			} else if (a[mid] < item) {
				return binarySearchInt(a, mid + 1, end, item);
			} else {
				return binarySearchInt(a, beg, mid - 1, item);
			}
		}
		return -1;
	}

	// binary search using String
	public static int binarySearchString(String str[], String x) {
		int beg = 0, end = str.length - 1;
		while (beg <= end) {
			int mid = (beg + end) / 2;
			if (str[mid].compareTo(x) < 0) {
				return beg = mid + 1;
			} else if (str[mid].compareTo(x) > 0) {
				return end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;

	}

	// Bubble Sort using integer array
	public static int bubbleSortInt(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		return -1;
	}

	// Bubble Sort using String Array

	public static String bubbleSortString(String str[]) {
		String temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[j].compareToIgnoreCase(str[i]) < 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			System.out.print(str[i] + " ");
		}
		return null;
	}

	// Insertion Sort using integer array
	public static int insertionSortInt(int arr[]) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp <= arr[j]) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		return 0;
	}

	// Insertion Sort using String Array

	public static String[] insertionSortString(String str[]) {
		String temp = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareToIgnoreCase(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			System.out.print(str[i] + " ");
		}

		return str;

	}

	/*
	 * FOr Merge Sort Merges two sub arrays of arr[]. First sub array is
	 * arr[l..m] Second sub array is arr[m+1..r]
	 */ public static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second sub arrays
		int i = 0, j = 0;

		// Initial index of merged sub array array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	public static void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// it gives the prime number of from 1 to user input
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	// it check the Anagram or not
	public static String checkAnagram(String str, String str2) {
		char[] arr1 = str.toCharArray();
		Arrays.sort(arr1);
		str = new String(arr1);
		// System.out.println(str);
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		str2 = new String(arr2);
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("It is anagram");
		} else {
			System.out.println("Not an Anagram");
		}
		return str2;

	}

	// It prints the harmonic series and harmonic value

	public static double printHarmonic(int num) {
		float harmonicvalue = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print("1/" + i + " ");
			harmonicvalue += (float) 1 / i;
		}
		System.out.println("\n" + harmonicvalue);
		return harmonicvalue;
	}

	// its gives the factors of Prime
	public static void primeFactors(long n) {

		for (int j = 2; j <= n; ++j) {
			if (n % j == 0) {
				n = n / j;
				System.out.print(j + " ");
			}
		}
	}

	// it gives the Powerof2 of numbers

	public static int[] powerOf(int num) {
		int n = 2;
		int result[] = new int[num];
		if (num < 32) {
			for (int i = 0; i < num; i++) {
				if (i == 0) {
					result[i] = n * (i + 1);
				} else {
					n = n * 2;
					result[i] = n;
				}
				// return true;

			}
			return result;
		} else {
			return result;
		}
	}

	// For Quadratic equation and factors

	public static double[] findQuadratic(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		double[] root = new double[2];
		if (delta > 0) {
			root[0] = -b + Math.sqrt(delta) / (2 * a);
			root[1] = -b - Math.sqrt(delta) / (2 * a);
			return root;
		}
		if (delta == 0) {
			root[0] = -b / (2 * a);
			root[1] = -b / (2 * a);
			return root;
		}
		if (delta < 0) {
			root[0] = -b / (2 * a);
			root[1] = Math.sqrt(-delta) / (2 * a);
			// System.out.println(realPart +" "+ imaginaryPart);
			// return realPart;
			return root;
		}
		System.out.println("Delta" + delta);
		return root;
	}

	// StopWAtch
	public static long starttime = 0;
	public static long stoptime = 0;
	static long elapsed;

	public static void start(int n) {
		starttime = System.currentTimeMillis();
		// System.out.println("The Started time is : "+starttime);
	}

	public static void stop(int n2) {
		stoptime = System.currentTimeMillis();
		// System.out.println("Stop time is : "+stoptime);
	}

	public static long getElapsed() {
		elapsed = stoptime - starttime;
		return elapsed;
	}

	// DayOFWEEk

	public static void dayOfWeek(int d, int m, int y) {

		if (m > 12 || d > 31 || y < 1582 || m < 1 || d < 1) {
			System.out.println("invalid month and day");
			return;
		}
		y = y - (14 - m) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		m = m + 12 * ((14 - m) / 12) - 2;
		d = (d + x + 31 * m / 12) % 7;
		// System.out.print("the date is " +d);

		switch (d) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednsday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid date");

		}

		// For Month
		m = m + 12 * ((14 - m) / 12);

		switch (m) {

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
	}

	// its check the leap year or not
	public static boolean isLeapYear(int year) {

		if (year < 1582) {
			System.out.println("You put the wrong value");
			return false;
		} else if ((year % 4 == 0 && year % 100 == 0) && year % 400 != 0) {
			System.out.println("It is not a leap year");
			return false;
		} else if ((year % 4 == 0 && year % 100 == 0) && year % 400 == 0) {
			System.out.println("This is a leap Year");
			return true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("It is a leap year");
			return true;
		}
		return true;
	}

	/**
	 * define function to count the factorial value of number
	 * 
	 * @param number
	 *            ==> int
	 * @return int
	 */
	public static int factorial(int number) {
		int factorial = 1;
		if (number == 0)
			return 0;
		else {
			while (number > 1) {
				factorial = factorial * number;
				number--;
			}
			return factorial;
		}
	}
}
