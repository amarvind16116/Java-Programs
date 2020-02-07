package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program mentiones internal implementation of Queue
 * */

public class Queue<T> {
	private T data[];
	private int size=0;
	private int capacity=1000;
	private int front=0;
	private int back=0;
	public Queue()
	{
		data=(T[]) new Object[capacity];
	}
	public Queue(int size)
	{
		data=(T[])new Object[size];
		capacity=size;
	}
	//adding value to the queue
	public void enqueue(T value)
	{
		if(back==capacity)
		{
			System.out.println("Queue Overflow Exception:");
			return;
		}
		data[back]=value;
		size++;
		back+=1;
		back=(back)%(capacity-1);
	}
	//removing value from front
	public T dequeue()
	{
		if(size==0)
		{
			System.out.println("Queue is empty");
			return null;
		}
		T value=data[front];
		front+=1;
		size--;
		return value;
	}
	//checks whether queue is empty or not
	public boolean isEmpty()
	{
		return size==0;
	}
	//returns size of queue
	public int size()
	{
		return size;
	}
	//will return initial data
	public T peek()
	{
		return data[front];
	}
}
