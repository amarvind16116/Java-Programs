package com.bridgelabz.datastructures;
import java.io.IOException;

import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program to use bank functionality add withdrawl check balance
 * */


public class CashCounter {
	
	public static boolean isBalanced() throws NumberFormatException, IOException
	{
		Queue<Integer> queue=new Queue<Integer>();
		int continueORend=999,options;
		int totalCashAmt=400;
		while(continueORend!=0)
		{
			System.out.print("Press 1 for Deposite and Press 2 for Withdrawl : ");
			options=InputUtility.nextInt();
			System.out.println("Enter cash amount:");
			int cashAmt = InputUtility.nextInt();
			queue.enqueue(400);
			if(options==1)
			{
				System.out.println("Thanks for depositing:");
				queue.enqueue(cashAmt);
				totalCashAmt=totalCashAmt+cashAmt;
				System.out.println(totalCashAmt);
			}
			else
				if(options==2)
				{
					if(totalCashAmt>cashAmt)
					{
						System.out.println("Withdrawl successfull:");
						totalCashAmt=totalCashAmt-cashAmt;
						System.out.println(totalCashAmt);
					}
					else
						System.out.println("Cash not available:");
				}
				else
				{
					System.out.println("Entered value is neigther 1 nor 2");
				}
			System.out.println("Enter 0 to end and 9 to continue:");
			continueORend=InputUtility.nextInt();
			if(continueORend==0)
			{
				break;
			}
		}
		if(totalCashAmt<=0)
		{
			return false;
		}
		else
			return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	 System.out.println("Welcome To Cash Counter\n");
	 boolean check=	isBalanced();
	 if(check==true)
	 {
		 System.out.println("At the End Amount is Balanced:");
	 }
	 else
		 System.out.println("At the End Amount is not Balanced:");
	}
	
}


