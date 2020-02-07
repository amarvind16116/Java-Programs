package com.bridgelabz.oops.jSON_Inventry.inventryManagement.controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.jSON_Inventry.inventryManagement.i_services.InventryInterface;
import com.bridgelabz.oops.jSON_Inventry.inventryManagement.repository.InventryServices;
import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program have main method to control the inventry management system
 */

public class InventryManagemnet {

	public static void main(String[] args) throws IOException, ParseException {

		int num = 10;
		
		InventryInterface inventry = new InventryServices();
		
		while(num != 0)
		{
			System.out.println("Press 1 for write into file/n Press 2 for Read File/nif you want to leave press 3");
			int check = InputUtility.nextInt();
			if(1 == check)
			{
				inventry.writeFile();
			}
			else if(2 == check)
			{
				inventry.readFile();
			}
			else if(3 == check)
			{
				return;
			}
			else
			{
				System.out.println("Wrong key pressed");
			}
			num++;
		}
	}
}
