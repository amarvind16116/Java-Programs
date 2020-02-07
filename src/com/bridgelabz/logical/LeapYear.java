package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to check the year is leap or not from the Utility class
 * @date     19-11-19
 *************************************************************************************/


public class LeapYear {
	
	public static void main(String[] args) {
	
		System.out.print("Enter year to check is leap Year or Not : ");
		int year = InputUtility.nextInt();
		Utility.isLeapYear(year);
	}
}
