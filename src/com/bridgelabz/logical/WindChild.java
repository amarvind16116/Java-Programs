package com.bridgelabz.logical;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to print wind child by measuring tempature
 * @date     19-11-19
 *************************************************************************************/

public class WindChild {

	public static void windChild(double t, double v) {
		double w = 0;
		if (t > 50 || v > 120 || v < 3) {
			System.out.println("its is novalid the temperatue greater than 50 and wind speed greater 120 and less 3");
			return;
		} else {
			w = 37.54 + 0.6215 * t + (0.4725 * t - 37.75) * Math.pow(v, 0.16);
		}
		System.out.println("the tempetarue is " + t);
		System.out.println("The Wind speed is" + v);
		System.out.println("the wind chill is" + w);
	}

	public static void main(String[] args) {
		
		
		System.out.println("Enter the Tempetrature in(Fatharenet)");
		double t = InputUtility.nextDouble();
		System.out.println("Enter the Wind Speed (miles per hour)");
		double v = InputUtility.nextDouble();
		windChild(t, v);

	}

}
