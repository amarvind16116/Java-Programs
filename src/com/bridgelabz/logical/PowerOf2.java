package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to print the power of 2 of given numbers
 * @date     19-11-19
 *************************************************************************************/


public class PowerOf2 {

	public static void main(String[] args){
		System.out.print("Enter the value for powerof2 : ");
		int num = InputUtility.nextInt();
		int[] arr = Utility.powerOf(num);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+", ");
		}
	}
}
