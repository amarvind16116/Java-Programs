package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to replace a one String to another String
 * @date     19-11-19
 *************************************************************************************/

public class ReplaceString {

	// FOr Replace a String
	public static String replaceString(String str) {
		String str1 = "Hello <<UserName>> How are you";
		String str2 = str1.replaceAll("<<UserName>>", str);
		System.out.println(str2);
		return str2;

	}

	public static void main(String[] args) {

		System.out.print("Enter the name that you want to replace : ");
		String str = InputUtility.nextString();
		replaceString(str);
	}

}
