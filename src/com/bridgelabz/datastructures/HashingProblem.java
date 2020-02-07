package com.bridgelabz.datastructures;

import java.util.*;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program is used to search a number if present remove it if not then push it to file
 * */

import java.io.*;

public class HashingProblem {

	// logic to read from file
	public static int[] readFile() throws Exception {
		FileReader file = new FileReader(
				"/home/admin1/Desktop/Arvind/23-Nov-2019-master/FellowShip/DataStructure/HashingFunction.txt");
		String string = "";
		int reader = 0;
		while ((reader = file.read()) != -1) {
			string = string + (char) reader;
		}
		String[] arr = string.split(" ");
		int size = arr.length;
		int arr1[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr1[i] = Integer.parseInt(arr[i]);
		}
		return arr1;
	}

	// logic to write in file
	public static void writeFile(String st) throws Exception {
		FileWriter f = new FileWriter(new File(
				"/home/admin1/Desktop/Arvind/23-Nov-2019-master/FellowShip/DataStructure/HashingFunction.txt"));
		f.write(st);
		f.flush();
	}

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		HashTable hashTable = new HashTable(20);
		String st;
		int[] arr = readFile();
		for (int i = 0; i < arr.length; i++) {
			hashTable.addValue(arr[i]);
		}
		hashTable.print();
		System.out.println();
		System.out.println("Enter number you want to Enter:");
		int a = s.nextInt();
		if (hashTable.find(a)) {
			System.out.println("Number is removed from file ");
			hashTable.remove(a);
			st = hashTable.returnString();
		} else {
			System.out.println("Number is added into the file ");
			hashTable.addValue(a);
			st = hashTable.returnString();
		}
		writeFile(st);
		System.out.println("The String wrote in file:" + " " + st);
	}

}
