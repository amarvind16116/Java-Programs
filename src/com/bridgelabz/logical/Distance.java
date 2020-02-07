package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to print the distance from the 4 points
 * @date     19-11-19
 *************************************************************************************/


public class Distance {
	public static boolean findDistance(double x1, double x2, double y1, double y2) {
		double x = x2 - x1;
		double y = y2 - y1;
		double local = Math.pow(x, 2) + Math.pow(y, 2);
		double result = Math.sqrt(local);
		System.out.println(result);
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Give the value of x1, x2, x3, x4 : ");
		double x1 = InputUtility.nextDouble();
		double x2 = InputUtility.nextDouble();
		double y1 = InputUtility.nextDouble();
		double y2 = InputUtility.nextDouble();

		Distance.findDistance(x1, x2, y1, y2);
	}
}
