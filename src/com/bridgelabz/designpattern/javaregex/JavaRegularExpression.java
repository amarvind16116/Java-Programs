package com.bridgelabz.designpattern.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utils.InputUtility;

public class JavaRegularExpression {

	public static void main(String[] args) throws Exception {
		int num =10;
		while (num != 0) {
			System.out.println("Enter word to find by REGEX Pattern : ");

			Pattern pattern = Pattern.compile(InputUtility.nextString());

			System.out.println("Enter Senetence to found above words : ");

			Matcher matcher = pattern.matcher(InputUtility.nextString());

			boolean found = false;

			while (matcher.find()) {
				System.out.println("I found the text : " + matcher.group() + " : at strat from index : "
						+ matcher.start() + " : and end index is : " + matcher.end());
				found = true;
			}

			if (!found) {
				System.out.println("No match Found");
			}
			num++;
		}

	}

}
