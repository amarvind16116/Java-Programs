package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  Program to print the monthly payment
 * @date     19-11-19
 *************************************************************************************/


public class MonthlyPayment {

	public static void main(String[] args) {
		
		System.out.print("Enter Years : ");
		int Y = InputUtility.nextInt();
		System.out.print("Enter Principal : ");
		double P = InputUtility.nextDouble();
		System.out.print("Enter Rate percent : ");
		double R = InputUtility.nextDouble();
		double n = 12*Y;
		double r = R/(12*100);
		double payment = P*r/1 - Math.pow((1+r), (-n));
		System.out.println("Monthly payment is : "+payment);
	}

}
