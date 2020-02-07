package com.bridgelabz.algorithms;

import com.bridgelabz.utils.InputUtility;
import com.bridgelabz.utils.Utility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to print the Anagram or not
 */

public class StringAnagram {
	
	
	public static void main(String[] args){
		System.out.println("Enter the First String : ");
		String str = InputUtility.nextString();
		System.out.println("Enter the second String : ");
		String str2 = InputUtility.nextString();
		Utility.checkAnagram(str, str2);
		
	}

}
