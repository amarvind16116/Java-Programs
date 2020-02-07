package com.bridgelabz.datastructures;
/**
 * @author :Arvind Kumar
 * Date: 3/12/2019
 * purpose: program is used to display primeNumbers and annagram using Stack
 * */

public class PrimeNumberUsingStack {
	
	//logic to check for annagram
		public static boolean isAnnagram(int start,int end)
		{
			String st="";
			String st1="";
			st=st+start;
			st1=st1+end;
			Stack<Character> stack=new Stack<Character>();
			Queue<Character> queue=new Queue<Character>();
			char ch[]=st.toCharArray();
			char ch1[]=st1.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				stack.push(ch[i]);
			}
			for(int i=0;i<ch1.length;i++)
			{
				queue.enqueue(ch1[i]);
			}
			int i=0;
			if(stack.size()!=queue.size())
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
		//logic to add prime numbers in stack
		public static int[] addPrime(int start,int end)
		{
			int arr[]=new int[1000];
			int k=0;
			for(int i=start;i<=end;i++)
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
		//logic for adding annagram in array
		public static int[] addAnnagram(int[] arr)
		{
			int size=arr.length;
			int arr1[]=new int[size];
			int arr2[] = new int[size];
			int k=0,z=0;
			for(int i=0;i<size-1;i++)
			{
				for(int j=size-1;j>i;j--)
				{
					if(isAnnagram(arr[i],arr[j]))
					{
						arr1[k++]=arr[i];
						arr2[z++] = arr[j];
						break;
					}
				}
			}
			int arr3[]=new int[k];
			for(int i=0;i<k;i++)
			{
				for(int j=i; j<=i; j++){
					
						arr3[i]=arr1[i];
						arr3[i+1]=arr2[j];
					
				}
				i++;
			}
			return arr3;
		}
	
	public static void main(String[] args) {
		
	 StackUsingLinkedList<Integer> stackUsingLinkedList=new StackUsingLinkedList<Integer>();
	 
	 int arr[]=addPrime(1,1000);
	 int arr1[]=addAnnagram(arr);
	 
	 for(int i=0;i<arr1.length;i++)
	 {
		 stackUsingLinkedList.push(arr1[i]);
	 }
	 
	 	stackUsingLinkedList.printReverse();
	
	}
	
}
