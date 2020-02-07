package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program mentiones internal implementation of hash table
 * */

public class HashTable {
	private int tableSize=1000;
	Node[] listArray;
	private class Node{
		private int value;
		private Node next;
		
		public Node(int v)
		{
			value=v;
			next=null;
		}
		public Node(int v,Node n)
		{
			value=v;
			next=n;
		}
	}
	public HashTable()
	{
		listArray=new Node[tableSize];
		for(int i=0;i<tableSize;i++)
		{
			listArray[i]=null;
		}
	}
	public HashTable(int size)
	{
		listArray=new Node[size];
		tableSize=size;
		for(int i=0;i<size;i++)
		{
			listArray[i]=null;
		}
	}
	//method to find a hash value
	public int hashValue(int value)
	{
		return value%tableSize;
	}
	//method for adding int value
	public void addValue(int value)
	{
		int index=hashValue(value);
		listArray[index]=new Node(value,listArray[index]);
	}
	//method for removing the value if present
	public boolean remove(int value)
	{
		int index=hashValue(value);
		Node curr=listArray[index];
		if(curr.value==value)
		{
			listArray[index]=curr.next;
			return true;
		}
		//generic case
		while(curr!=null)
		{
			if(curr.next!=null&&curr.next.value==value)
			{
				curr.next=curr.next.next;
				return true;
			}
			else
				curr=curr.next;
		}
		return false;
	}
	//method for printing
	public void print()
	{
		
		for(int i=0;i<tableSize;i++)
		{
			Node curr=listArray[i];
			while(curr!=null)
			{
				System.out.print(curr.value+" ");
				curr=curr.next;
			}
			
		}
	}
	//method for finding value
	public boolean find(int value)
	{
		int index=hashValue(value);
		Node curr=listArray[index];
		while(curr!=null)
		{
			if(curr.value==value)
			{
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	//return String value
	public String returnString()
	{
		String st="";
		for(int i=0;i<tableSize;i++)
		{
			Node curr=listArray[i];
			while(curr!=null)
			{
				st=st+curr.value+" ";
				curr=curr.next;
			}
		}
		return st;
	}
	//adding at a desired index
	public void addAtIndex(int index,int value)
	{
		if(listArray[index]==null)
		{
			listArray[index]=new Node(value,listArray[index]);
			return;
		}
		//adding at head
		    Node curr=listArray[index];
			Node n=new Node(value);
			if(curr.value>value)
			{
				n.next=curr;
				listArray[index]=n;
			}
	     //generic case
			else
			{
				while(curr.next!=null)
				{
					curr=curr.next;
				}
				curr.next=n;
			}
	}
}