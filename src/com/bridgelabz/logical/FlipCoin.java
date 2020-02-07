package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to flip a coin and check percentage of head and tails
 * @date     19-11-19
 *************************************************************************************/


public class FlipCoin {
	public static boolean  flipCoins(int d){
		
		double head = 0;
		double tail = 0;
		for(int i =1; i<=d; i++){
			if(Math.random() < 0.5){
				tail++;
				return true;
			}
			else{
				head++;
				return true;
			}
		}
		System.out.println("Heads"+"\t"+"Tails");
		System.out.println(head+"\t"+tail);
		System.out.println("Percentage of Heads and Tails : ");
		System.out.println((head*100)/d+"\t"+(tail*100)/d);
		return true;
	}
	
	public static void main(String[] args){
		System.out.print("How many times you flip coin : ");
		int num = InputUtility.nextInt();
		FlipCoin.flipCoins(num);
	}
}
