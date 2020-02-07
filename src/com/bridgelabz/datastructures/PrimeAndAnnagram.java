package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program is used to display prime and annagram in 2D 
 * */

public class PrimeAndAnnagram {
	
	//logic to check numbers are Annagram or not
		public static boolean isAnnagram(int num1,int num2)
		{
			String string="";
			String string1="";
			string=string+num1;
			string1=string1+num2;
			Stack<Character> stack=new Stack<Character>();
			Queue<Character> queue=new Queue<Character>();
			char ch[]=string.toCharArray();
			char ch1[]=string1.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				stack.push(ch[i]);
			}
			for(int i=0;i<ch1.length;i++)
			{
				queue.enqueue(ch1[i]);
			}
			int i=0;
			if(stack.size()!=stack.size())
			{
				return false;
			}
			while(stack.isEmpty()==false&&i<ch1.length&&queue.isEmpty()==false)
			{
				if(stack.pop()!=queue.dequeue())
				{
					return false;
				}
				i+=1;
			}
			return true;
		}
		
		
		//logic to add prime numbers in Stack
		public static int[] addPrime(int num1,int num2)
		{
			int arr[]=new int[1000];
			int k=0;
			for(int i=num1;i<=num2;i++)
			{
				int count=0;
				for(int j=i;j>=1;j--)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					arr[k++]=i;
				}
			}
			int arr1[]=new int[k];
			for(int i=0;i<k;i++)
			{
				arr1[i]=arr[i];
			}
			return arr1;
		}
		
		
		//adding all anagram into array
		public static int[] addAnnagram(int[] arr)
		{
			int size=arr.length;
			int arr1[]=new int[size];
			int k=0;
			for(int i=0;i<size-1;i++)
			{
				for(int j=size-1;j>i;j--)
				{
					if(isAnnagram(arr[i],arr[j]))
					{
						arr1[k++]=arr[i];
						break;
					}
				}
			}
			int arr2[]=new int[k];
			for(int i=0;i<k;i++)
			{
				arr2[i]=arr1[i];
			}
			return arr2;
		}
	
	public static void main(String[] args) {
		HashTable hashTable=new HashTable(4);
		HashTable hashTable1=new HashTable(4);
		int arr[]=addPrime(1,1000);
	    int arr1[]=addAnnagram(arr);
		for(int i=0;i<arr.length;i++)
		{
			hashTable.addAtIndex(0,arr[i]);
		}
		hashTable.print();
		System.out.println();
		for(int i=0;i<arr1.length;i++)
		{
			hashTable1.addAtIndex(1,arr1[i]);
		}
		hashTable1.print();
	}
	
}
