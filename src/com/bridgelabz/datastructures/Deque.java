package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program represents internal implementation of deque
 * */

public class Deque<T> {
	private Node head=null;
	private int size=0;
	private class Node{
		private Node next;
		private T value;
		public Node(T v,Node n)
		{
			value=v;
			next=n;
		}
		public Node(T v)
		{
			value=v;
			next=null;
		}
		public Node()
		{
			value=null;
			next=null;
		}
	}
	
	//adding element in front
	public void addFront(T value)
	{
		head=new Node(value,head);
		size++;
	}
	//adding element rear
	public void addRear(T value)
	{
	    Node n=new Node(value,null);	
		if(head==null)
		{
			head=n;
			size++;
			return;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=n;
		size++;
		return;
	}
	
	//removing from front
	public T removeFront()
	{
		if(head==null)
		{
			System.out.println("Deque is Empty:");
			return null;
		}
		Node curr=head;
		head=head.next;
		size--;
		return curr.value;
		
	}
	
	//removing from rear
	public T removeEnd()
	{
		if(head==null)
		{
			System.out.println("Deque is Empty:");
			return null;
		}
		Node curr=head;
		Node prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		T ans=curr.value;
		prev.next=null;
		size--;
		return ans;
	}
	
	//checking if deque is empty
	public boolean isEmpty()
	{
		return size==0;
	}
	
	//returning the size of deque
	public int size()
	{
		return size;
	}
}