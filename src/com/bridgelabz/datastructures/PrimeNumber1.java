package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program is used to display prime number in 2D array
 * */

public class PrimeNumber1 {
	
	// to check print prime numbers
	public static String isPrime(int start,int end)
	{
		String string="";
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count+=1;
				}
			}
			if(count==2)
			{
				string=string+i+" ";	
			}
		}
		return string;
	}
	
	// for changing in array
	public static int[] changeInArray(String st)
	{
		String arr1[]=st.split(" ");
		int arr[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=Integer.parseInt(arr1[i]);
		}
		return arr;
	}
	
	// add primeNumbers in HashTable Array
	public static HashTable addInArray(int index,int[] arr)
	{
		HashTable h=new HashTable(10);
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			h.addAtIndex(index,arr[i]);
		}
		return h;
	}

	
	public static void main(String[] args) {
	int start=1;
	int end=100;
	while(start<=901&&end<=1000)
	{
		int index=0;
		String string=isPrime(start,end);
		start=start+100;
		end=end+100;
		int arr[]=changeInArray(string);
		HashTable hashtable=addInArray(index,arr);
		index+=1;
		System.out.println("\t\tPrime numbers between"+(start-100)+" to "+(end-100)+"\n");
		hashtable.print();
		System.out.println("\n");
	}
	}
	
}
