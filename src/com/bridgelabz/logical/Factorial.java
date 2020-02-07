package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  Program to print the factor from utility
 * @date     19-11-19
 *************************************************************************************/


public class Factorial {

	public static void main(String[] args){

		System.out.println("Eneter value for factorial : ");
		long n = InputUtility.nextLong();
		Utility.primeFactors(n);
	}
}
