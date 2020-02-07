package com.bridgelabz.datastructures;
import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program is to check the String pallindrome or not
 * */


public class Palindrome {
	
	// to check String is Palindrome or NOT
	public static boolean isPalindrome(String string)
	{
		//using my own stack implemented
		Stack<Character> stack=new Stack<Character>();
		char []ch=string.toCharArray();
		int size=ch.length;
		for(int i=0;i<ch.length;i++)
		{
			stack.push(ch[i]);
		}
		int i=0;
		while(stack.isEmpty()==false&&i<size)
		{
			if(stack.pop()!=ch[i])
			{
				return false;
			}
			i+=1;
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
	//	Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String string=InputUtility.nextString();
		if(isPalindrome(string))
		System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is not Palindrome");
	}

}
