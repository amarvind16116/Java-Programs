package com.bridgelabz.algorithms;

import java.util.Arrays;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the binary numbers
 */

public class BinarySearch {

	public static void main(String[] args)  {
		int[] arr = { 16, 19, 20, 23, 45, 56, 78, 90, 96, 100 };
		for (int count : arr)
			System.out.print(count + " ");
		System.out.println();
		String[] str = { "contribute", "geeks", "ide", "practice", "no", "yes", "java" };
		Arrays.sort(str);
		System.out.print("Enter the item which you want  to search : ");
		int item = InputUtility.nextInt();
		System.out.println(Utility.binarySearchInt(arr, 0, arr.length, item));

		Arrays.sort(str);

		System.out.print("\nEnter the item which you want  to search : ");
		String strItem = InputUtility.nextString();
		System.out.println(Utility.binarySearchString(str, strItem));
	}

}
