package com.bridgelabz.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to take the input from the user in int, String, double, long, char etrc;
 */

public class InputUtility {
	private static final InputStreamReader ITR = new InputStreamReader(System.in);

	private static final BufferedReader BR = new BufferedReader(ITR);

	// it takes the integer value from the user
	public static int nextInt(){
		int num = 0;
		try{
			num = Integer.parseInt(BR.readLine());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return num;
	}

	// it takes the String value from the user
	public static String nextString(){
		String str = null;
		try
		{
			str = BR.readLine();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return str;
	}

	// it takes the Double value from the user
	public static double nextDouble(){
		double d = 0;
		try {
			d = Double.parseDouble(BR.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return d;
	}

	// it takes the long value from the user
	public static long nextLong() {
		long l = 0;
		try {
			l = Long.parseLong(BR.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}

	// it takes the character value from the user
	public static char nextChar(){
		char c = 0;
		try {
			c = (char) (BR.readLine().charAt(0));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return c;
	}

}
