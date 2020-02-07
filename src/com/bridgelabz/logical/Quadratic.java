package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to print the quadratic equation and its solution
 * @date     19-11-19
 *************************************************************************************/


public class Quadratic {

	public static void main(String[] args){
		
		System.out.println("Eneter three value for Quadratic equation : ");
		double a = InputUtility.nextDouble();
		double b = InputUtility.nextDouble();
		double c = InputUtility.nextDouble();
		
		double arr[] =Utility.findQuadratic(a, b, c);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
