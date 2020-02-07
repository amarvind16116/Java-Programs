package com.bridgelabz.datastructures;

import java.io.IOException;

import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program is used to find paenthesis is balanced or not
 * */
public class BalancedParenthesis {

	public static boolean balancedParenthesis(char[] expression, int length) {

		// object of Stack class
		Stack stack = new Stack(length);
		// logic to check parenthesis in expression
		for (int i = 0; i < length; i++) {
			if (expression[i] == '{' || expression[i] == '(' || expression[i] == '[')
				stack.push(expression[i]);
			if (expression[i] == '}' || expression[i] == ')' || expression[i] == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (!isMatchingPair((char) stack.pop(), expression[i]))
						return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	// define static function isMatchingPair() to match the opened and closed

	public static boolean isMatchingPair(char ch1, char ch2) {
		if (ch1 == '(' && ch2 == ')')
			return true;
		else if (ch1 == '{' && ch2 == '}')
			return true;
		else if (ch1 == '[' && ch2 == ']')
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the expression : ");
		char[] expression = InputUtility.nextString().toCharArray();
		int length = expression.length;

		// checking the parenthesis is balanced or not
		if (balancedParenthesis(expression, length))
			System.out.println("Balanced");
		else
			System.out.println("Unbalanced");

	}
}
