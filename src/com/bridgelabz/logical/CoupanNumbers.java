package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  Program to generate the random coupan numbers
 * @date     19-11-19
 *************************************************************************************/


public class CoupanNumbers {

	public static void coupanNuumbers(int num){
		double arr[] = new double[num];
		int count = 0;
		while(num != 0){
			for(int i=0; i<arr.length; i++){
				arr[i] = Math.random();
			}
			for(int i=0; i<arr.length; i++)
			{
				for(int j=i+1; j<arr.length; j++){
					if(arr[i]==arr[j]){
						break;
					}
					else{
						count++;
					}
				}
				
			}
			num--;
		}
		System.out.println(count);
			
 	}
	
	public static void main(String[] args){
		
		System.out.print("Enter the numbers for coupan Generated : ");
		int num = InputUtility.nextInt();
		coupanNuumbers(num);
		
		
	}

}
