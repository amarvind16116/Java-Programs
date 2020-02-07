package com.bridgelabz.datastructures;

import java.io.*;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program is used to check for a number if present removed else added in file
 * */

import java.util.*;

public class UnOrderedFile {

	private static final String PATH = "/home/admin1/Desktop/Arvind/23-Nov-2019-master/FellowShip/DataStructure/UnOrderedList.txt";

	public static String[] readfile() {
		// logic for reading the file

		File f = new File(PATH);
		// this will reference one line at a time
		String st = null;
		String st1 = "";
		String[] arr;
		try {
			// file reader reads text files
			FileReader file = new FileReader(f);
			// wrap file in buffered reader
			BufferedReader br = new BufferedReader(file);
			while ((st = br.readLine()) != null) {
				st1 = st1 + st;
			}
			// close the file
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("couldnot found the file");
		} catch (IOException ex) {
			System.out.println("Error reading file");
		}
		arr = st1.split(" ");
		return arr;
	}

	public static void writefile(String st) {
		File file = new File(PATH);
		try {
			FileWriter f = new FileWriter(file);
			// wrap this inside BufferedWriter

			f.write(st);
			f.flush();
		} catch (IOException ex) {
			System.out.println("File not found");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		UnOrderedLinkedList<String> unOrderedLinkedList = new UnOrderedLinkedList<String>();
		// logic for reading the file
		String[] arr = readfile();
		int size = arr.length;
		// logic for adding String to the linked list
		for (int i = 0; i < size; i++) {
			unOrderedLinkedList.append(arr[i]);
		}
		// asking user for word input
		System.out.println("Enter word you want to search from file:");
		String st = s.next();
		// calling search function
		boolean b = unOrderedLinkedList.search(st);
		if (b) {
			System.out.println("word found:");
			System.out.println("After removing the word list obtained:");
			unOrderedLinkedList.remove(st);
			unOrderedLinkedList.display();
		} else {
			System.out.println("adding word to the list:");
			unOrderedLinkedList.append(st);
			unOrderedLinkedList.display();
		}
		String ans = unOrderedLinkedList.returnString();
		writefile(ans);

	}

}
