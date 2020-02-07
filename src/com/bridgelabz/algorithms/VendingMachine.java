package com.bridgelabz.algorithms;

import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to give the notes of in array seprate
 */

public class VendingMachine {
	public static void main(String[] args)
	{
		System.out.println("Enter the amout to be calculated");
		int n= InputUtility.nextInt();
		System.out.println(count(n));
	}
	
	public static int count(int num)
	{
		int notes[]={1000,500,100,50,10,5,2,1};
		int notecount[]=new int[8];
		
		for(int i=0;i<notes.length;i++)
		{
			if(num>=notes[i])
			{
				notecount[i]=num/notes[i];
				num=num-notecount[i]*notes[i];
			}
		}
		 System.out.println("Currency Count ->"); 
		 int out=0;  
		 for (int i = 0; i<8; i++)
	        { 
	        	
	            if (notecount[i] != 0)
	            { 
	                out=out+ notecount[i];
	            	 
	            }     
	        }
	        return out;
	}
}
