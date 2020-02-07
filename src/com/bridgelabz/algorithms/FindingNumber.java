package com.bridgelabz.algorithms;

import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to find the number
 */

public class FindingNumber {

	public static void search(int num, int n) {
		if (num > n) {
			if (num == Math.pow(2, n)) {
				System.out.println(n);
			}
			search(num, n + 1);
		}

	}

	public static void main(String[] args)  {

		int num = InputUtility.nextInt();
		int n = 0;
		search(num, n);
	}

}
