package com.bridgelabz.datastructures;

/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program implementation of DEQUE
 * */


public class MyDeque {
	
	static final int MAX = 100;
	int arr[];
	int front;
	int rear;
	int size;
	
	public MyDeque(int size)
	{
		arr = new int[MAX];
		front = -1;
		rear = 0;
		this.size = size;
	}

	// Checks DQ is full or not
	boolean isFull()
	{
		return ((front==0 && rear == size-1) || front == rear+1);
	}
	
	//Check DQ is empty or not
	boolean isEmpty()
	{
		return front == -1;
	}
	
	// Inserts an element at front
	public void addFront(int value)
	{
		if(isFull())
		{
			System.out.println("Stack Overflow ");
			return;
		}
		
		if(front == -1)
		{
			front = 0;
			rear = 0;
			
		}
		
		else if(front == 0)
		{
			front = size + 1;
		}
		
		else
		{
			front = front + 1;
		}
		arr[front] = value;
	}
	
	// Insert value at rear
	public void addRear(int value)
	{
		if(isFull())
		{
			System.out.println("Stack OverFlow");
			return;
		}
		
		if(front==-1)
		{
			front = 0;
		}
		else if(rear == size-1)
		{
			rear = 0;
		}
		else
		{
			rear = rear+1;
		}
		arr[rear] = value;
	}
	
	public void display()
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != 0)
				System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
	
		MyDeque d = new MyDeque(10);
		
		d.addFront(85);
		d.addFront(73);
//		d.addFront(74);
//		d.addFront(65);
//		d.addRear(56);
//		d.addFront(10);
//		d.addRear(52);
		d.display();
		
	}
	
}
















