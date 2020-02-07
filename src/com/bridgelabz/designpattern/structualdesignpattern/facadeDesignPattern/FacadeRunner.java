package com.bridgeLabz.designPattern.structualDesignPattern.facadeDesignPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FacadeRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int choice;
		
		do
		{
			System.out.println("Press 1. Iphone");
			System.out.println("Press 2. Samsung");
			System.out.println("Press 3. OnePlus");
			System.out.println("Press 4. Exit");
			
			choice = Integer.parseInt(br.readLine());
			ShopKeeper sk = new ShopKeeper();
			
			switch(choice)
			{
			case 1 :
				sk.iphoneSale();
				break;
			case 2 :
				sk.samsungSale();
				break;
			case 3 :
				sk.oneplusSale();
				break;
			case 4 :
				System.exit(0);
			default :
				System.out.println("Enetered Invalid Number");
				return;
			}
		}
		
		while(choice!=4);
		} catch(Exception e)	{
			e.printStackTrace();
		}
	}

}
