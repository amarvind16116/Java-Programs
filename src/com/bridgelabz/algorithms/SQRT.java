package com.bridgelabz.algorithms;

import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the squareroot value of number
 */

public class SQRT {

	public static void main(String[] args) {
		
		System.out.print("Enter the value : ");
		double c = InputUtility.nextDouble();
		
		double t=c;
		double epsilon = 1e-15;
		while(Math.abs(t-c/t) > epsilon*t){
			t = (c/t+t)/2.0;
		}
		System.out.println(t);
	}

}
