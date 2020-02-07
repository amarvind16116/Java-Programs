package com.bridgelabz.algorithms;

import java.util.Arrays;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the binary words
 */

public class BinarySearchForWord {

	public static void main(String[] args)  {

		String str = InputUtility.nextString();
		String[] word = str.split(" ");
		System.out.print("Read String from file is : ");
		for (String d : word)
			System.out.print(d + " ");
		System.out.println();
		Arrays.sort(word);
		System.out.print("After Sorting : ");
		for (String d : word)
			System.out.print(d + " ");
		// System.out.println("\n Word index is : ");
		System.out.println();
		System.out.print("Enetrr the word that you want to seacrh : ");
		String s = InputUtility.nextString();
		System.out.println(Utility.binarySearchString(word, s));
	}

}
