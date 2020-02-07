package com.bridgelabz.logical;

import java.util.ArrayList;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program to print the String permutation
 * @date     19-11-19
 *************************************************************************************/

public class StringPermutation {

	static ArrayList<String> al = new ArrayList<String>();
	public static ArrayList<String> permute(String str, int l, int r){
		if (l==r){
			al.add(str);
		}
		else{
			for(int i=l; i<r; i++){
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str, i, i);
			}
		}
		return al;
	}

	public static String swap(String str, int i, int j){
		char temp;
		char[] arr = str.toCharArray();
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		return String.valueOf(arr);
	}
	
    public static void main(String[] args){
        
        System.out.print("Eneter the value of String for permutation : ");
        String str = InputUtility.nextString();
        int index = 0;
        int end = str.length();
        System.out.println(permute(str, index, end));
    }

}
