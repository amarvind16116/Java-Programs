package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program mentiones internal implementaion of Queue Using Linked List
 * */

public class QueueUsingLinkedList<T> {
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
	}
	//logic for adding value
	public void add(T value)
	{
		if(head==null)
		{
			head=new Node(value,head);
			size++;
			return;
		}
		Node curr=head;
		Node n=new Node(value,null);
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=n;
		size++;
	}
	//removal from first index
	public T remove()
	{
		if(head==null)
		{
			System.out.println("Empty Linked List:");
			return null;
		}
		T value=head.value;
		head=head.next;
		size--;
		return value;
	}
	//checking for empty Queue
	public boolean isEmpty()
	{
		return (size==0);
	}
	//return size of Queue
	public int size()
	{
		return size;
	}
	//printing
	public void print()
	{
		if(head==null)
		{
			System.out.println("linked list empty:");
			return;
		}
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.value+" ");
			curr=curr.next;
		}
	}
}
