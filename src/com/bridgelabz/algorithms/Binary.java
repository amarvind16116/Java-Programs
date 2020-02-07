package com.bridgelabz.algorithms;

import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the binary numbers
 */

public class Binary {

	static int ar[] = { 0, 0, 0, 0, 0, 0, 0, 0 };

	public static String toBinary(int n) {

		String str = "";
		int i = 7;

		while (n > 0) {
			str = (n % 2) + str;
			ar[i] = n % 2;
			n /= 2;
			if (i == 0)
				break;
			i--;

		}
		return str;
	}

	public static void swap() {
		for (int i = 0; i < 4; i++) {
			int temp = ar[i];
			ar[i] = ar[i + 4];
			ar[i + 4] = temp;
		}
	}

	public static int toDecimal() {
		int res = 0;
		for (int i = 0; i < 8; i++) {
			res += (int) (Math.pow(2, 7 - i) * ar[i]);
		}
		System.out.println();
		return res;
	}

	public static void main(String[] args){
		int num = InputUtility.nextInt();
		if (num > 255) {
			System.out.println("Length of this binary representation is grater than 8 bits");
			return;
		}
		toBinary(num);
		System.out.println("\nFollowing is binary representation of " + num + " : ");

		for (int a : ar)
			System.out.print(a);
		System.out.println("\nFollowing is reverse bits : ");
		swap();
		for (int i = 0; i < 8; i++) {
			System.out.print(ar[i]);
		}
		System.out.println("\nDecimal value of reverse bits is : " + toDecimal());
	}

}
