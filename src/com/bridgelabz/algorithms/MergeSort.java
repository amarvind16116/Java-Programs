package com.bridgelabz.algorithms;

import com.bridgelabz.utils.Utility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to sort the array by using Merge Algorithmm
 */

public class MergeSort {

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		Utility.printArray(arr);

		Utility.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		Utility.printArray(arr);
	}
}
