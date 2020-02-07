package com.bridgelabz.algorithms;

import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the temprature
 */

public class TempratureConversion {

	public static void main(String[] args) {
		System.out.println("Enter the temperature in fahrenheit");
		double temp=InputUtility.nextDouble();
		double fat=(temp*9/5)+32;
		double cel=(temp-32)*5/9;
		System.out.println("the celsius to fahrenheit is"+fat+"F");
		System.out.println("the  fahrenheit to celsius  is"+cel+"C");
	}

}
