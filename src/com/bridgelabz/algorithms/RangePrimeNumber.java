package com.bridgelabz.algorithms;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the prime numbers
 */

public class RangePrimeNumber {

	public static void main(String[] args){
		System.out.println("Enter the strating point of Prime no. : ");
		int num1 = InputUtility.nextInt();
		System.out.println("Enter the Ending point of Prime no. : ");
		int num2 = InputUtility.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			if( Utility.isPrime(i))
				System.out.print(i+" ");
		}
	}

}
