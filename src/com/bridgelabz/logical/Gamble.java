package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to print the gaming simulator
 * @date     19-11-19
 *************************************************************************************/


public class Gamble {
	
	public static void gamingSimulator(int play, int stake, int goal){
		int win = 0;
		for(int i=0; i<play; i++){
			int cash = stake;
			while(cash > 0 && cash < goal){
				if(Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if(cash == goal)
				win++;
		}
		System.out.println(win);
		float wins = ((float)win/play)*100;
		float loss = 100-wins;
		System.out.println("Win % : "+wins);
		System.out.println("Loss % : "+ loss);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the value of Stake : ");
		int stake = InputUtility.nextInt();
		System.out.print("Enetr the goal ammount : ");
		int goal = InputUtility.nextInt();
		System.out.print("Number of time plays : ");
		int play = InputUtility.nextInt();
		gamingSimulator(play, stake, goal);
		
	}

}
