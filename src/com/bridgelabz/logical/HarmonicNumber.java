package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to print the harmonic series and its solution
 * @date     19-11-19
 *************************************************************************************/


public class HarmonicNumber {

	public static void main(String[] args){
		
		System.out.print("Enetr the value for harmonic Series : ");
		int num = InputUtility.nextInt();
		Utility.printHarmonic(num);
	}

}
