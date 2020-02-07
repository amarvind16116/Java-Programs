package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to call the DAY_OF_WEEK method from Utility class
 * @date     19-11-19
 *************************************************************************************/


public class DayOfWeek {

	public static void main(String[] args){

		System.out.print("Eneter the value of day : ");
		int date = InputUtility.nextInt();
		System.out.print("Eneter the value of month : ");
		int month = InputUtility.nextInt();
		System.out.print("Eneter the value of year : ");
		int year = InputUtility.nextInt();
		Utility.dayOfWeek(date, month, year);
	}

}
