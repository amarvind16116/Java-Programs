package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to calculate to print the sum of three  integers
 * @date     19-11-19
 *************************************************************************************/

public class SumOfThreeIntegers {

	public static void sumOfThreeIntegers(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				for(int k=j+1; k<arr.length; k++){
					if((arr[i]+arr[j]+arr[k])==0)
						System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" = "+(arr[i]+arr[j]+arr[k]));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("Eneter the size of Array : ");
		int num = InputUtility.nextInt();
		System.out.println("Now Enetr the Element in Array");
		int[] arr = new int[num];
		for(int i = 0; i<num; i++){
			arr[i]= InputUtility.nextInt();
		}
		sumOfThreeIntegers(arr);
	}

}
