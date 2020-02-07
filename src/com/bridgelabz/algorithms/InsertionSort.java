package com.bridgelabz.algorithms;

import com.bridgelabz.utils.Utility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to sort the array by using isertion algorithm
 */

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23 };
		Utility.insertionSortInt(arr);
		System.out.println();
		String[] str = { "Atlaota", "Atlanta", "New York", "Dallas", "Omaha", "San Francisco" };
		Utility.insertionSortString(str);

	}

}
