package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to print the 2D Array
 * @date     19-11-19
 *************************************************************************************/


public class Array2D {

	public static void printIntegeArray(int i, int j){
		int[][] arr = new int[i][j];
		for(int k=0; k<i; k++){
			for(int l=0; l<j; l++){
				arr[k][l] = k+l;
			}
		}
		for(int k=0; k<i; k++){
			for(int l=0; l<j; l++){
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
	}
	
	public static void printDoubleArray(int i, int j){
		double[][] arr = new double[i][j];
		for(double k=0; k<i; k++){
			for(double l=0; l<j; l++){
				arr[(int)k][(int)l] = k+l;
			}
		}
		for(double k=0; k<i; k++){
			for(double l=0; l<j; l++){
				System.out.print(arr[(int)k][(int)l]+"  ");
			}
			System.out.println();
		}
	}
	
	public static void printBooleanArray(int i, int j){
		boolean[][] arr = new boolean[i][j];
		boolean b1 = true;
		boolean b2 = false;
		for(int k=0; k<i; k++){
			for(int l=0; l<j; l++){
				if(k+l == 0 || (k+l)%2==0)
					arr[k][l] = b2;
				
				else
					arr[k][l]=b1;
			}
		}
		for(int k=0; k<i; k++){
			for(int l=0; l<j; l++){
				System.out.print(arr[k][l]+"  ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args){
		
		System.out.print("Eneter the numbers of rows : ");
		int i = InputUtility.nextInt();
		System.out.print("Eneter the numbers of Coloumns : ");
		int j = InputUtility.nextInt();
		
		printIntegeArray(i, j);
		printDoubleArray(i, j);
		printBooleanArray(i, j);
		
	}

}
