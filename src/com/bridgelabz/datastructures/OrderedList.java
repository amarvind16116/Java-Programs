package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program mentiones internal implementation of Ordered list
 * */

public class OrderedList<T extends Comparable<T>>{
private Node head=null;
private int size=0;
private class Node{
	private Node next;
	private T value;
	public Node(T v,Node n)
	{
		next=n;
		value=v;
	}
	public Node(T v)
	{
		value=v;
		next=null;
	}
}
//sorted order adding method
public void add(T value)
{
	Node n=new Node(value);
	if(head==null)
	{
		head=n;
		size++;
		return;
	}
	//logic for head
	if(( head.value).compareTo(value)>0)
	{
		n.next=head;
		head=n;
		size++;
		return;
	}
	//generic method
	Node curr=head;
	while(curr.next!=null)
	{
		if((value).compareTo(curr.next.value)<0)
		{
			n.next=curr.next;
			curr.next=n;
			size++;
			return;
		}
		curr=curr.next;
	}
	//logic for adding at tail
	curr.next=n;
	size++;
}	
public void display()
{
	if(head==null)
	{
		System.out.println("Linked list empty:");
		return;
	}
	Node curr=head;
	while(curr!=null)
	{
		System.out.print(curr.value+" ");
		curr=curr.next;
	}
}
//return value logic
 public T returnValue(T value)
{
	 T v=null;
	//head
	 if(head.value==value)
	 {
		 head=head.next;
		 size--;
		 v=head.value;
	 }
	 else 
	 { //generic case
	    Node curr=head;
	    Node prev=null;
	    while(curr.next!=null)
	   {
	    	prev=curr;
			curr=curr.next;
		  if(curr.value==value)
		 {
			v=curr.value;
			prev.next=curr.next;
			size--;
		 }
		  
	   }
    }
	 return v;
}
 //logic for searching Item
 public boolean searchItem(T value)
 {
	if(head==null)
	{
		System.out.println("Linked List Empty:");
		return false;
	}
	Node curr=head;
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
 //logic to check empty linked list
 public boolean isEmpty()
 {
	 return (size==0);
 }
 //index of searched item
 public int index(T value)
 {
	 int i=0;
	 int j=0;
	 Node curr=head;
	 while(curr!=null)
	 {
		if(curr.value==value)
		{
			j=i;
			break;
		}
		i+=1;
		curr=curr.next;
	 }
	 return j;
 }
 //logic for removing last element from list
 public T pop()
 {
	 T v=null;
	 if(head==null)
	 {
		 System.out.println("Empty Linked List");
		 return null;
	 }
	 //for 1 element
	 if(head.next==null)
	 {
		 head=null;
		 size--;
		 return head.value;
	 }
	 //generic case
	 Node curr=head;
	 Node prev=null;
	 while(curr.next!=null)
	 {
		 prev=curr;
		 curr=curr.next;
	 }
	 v=curr.value;
	 size--;
	 prev.next=null;
	 return v;
 }
 //logic for returning element at some given index
 public T pop(int i)
 {
	 int j=0;
	 T v=null;
	 //logic for zero index
	 if(i==j)
	 {
		v=head.value;
		size--;
		head=head.next;
	 }
	 //logic for general case
	 else
	 {
		 Node curr=head;
		 Node prev=head;
		 while(curr!=null)
		 {
			 if(i==j)
			 {
				 v=curr.value;
				 prev.next=curr.next;
				 size--;
				 break;
			 }
			 prev=curr;
			 curr=curr.next;
			 j++;
		 }
	 }
	 return v;
 }
 public int size()
 {
	 return size;
 }
 //returning String value
 public String returnString()
 {
	 String st="";
	 Node curr=head;
	 while(curr!=null)
	 {
		 st=st+curr.value+" ";
		 curr=curr.next;
	 }
	 return st;
 }
 }
