package com.bridgelabz.algorithms;

import com.bridgelabz.utils.Utility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the bubble sorting in integer
 */


public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
		String str[] = {"Ankur","Arjun","Karan","Deepak","Deepanshu"};
		Utility.bubbleSortInt(arr);
		System.out.println();
		Utility.bubbleSortString(str);
	}

}
