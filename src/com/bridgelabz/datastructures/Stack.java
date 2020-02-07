package com.bridgelabz.datastructures;
/**
 * @author Arvind
 * Date: 3/12/2019
 * purpose: program mentions internal implementation of stack
 * */

public class Stack<T> {
private T data[];
private int top=-1;
private int capacity=1000;
private int size=0;
 
   public Stack()
   {
	   data= (T[]) new Object[capacity];
   }
   public Stack(int size)
   {
	   data=(T[]) new Object[size];
	   capacity=size;
   }
   //method for checking empty stack
   public boolean isEmpty()
   {
	   return size==0;
   }
   //method for adding element
   public void push(T value)
   {
	   if(size==capacity)
	   {
		   System.out.println("Stack Overflow Exception:");
		   return;
	   }
	   top+=1;
	   data[top]=value;
	   size+=1;
   }
   //method for removing element from top
   public T pop()
   {
	   if(isEmpty())
	   {
		   System.out.println("Empty stack Exception:");
		   return null;
	   }
	   T value=data[top];
	   top--;
	   size--;
	   return value;
   }
   //method for returning last value
   public T peek()
   {
	   if(isEmpty())
	   {
		   System.out.println("Stack Empty Exception:");
		   return null;
	   }
	   return data[top];
   }
   //method for returning the size of Stack
   public int size()
   {
	   return size;
   }
   //method for printing stored contents
   public void displayBehind()
   {
	   for(int i=top;i>=0;i--)
	   {
		   System.out.print(data[i]+" ");
	   }
   }
   //method for printing stored content from front
   public void displayFront()
   {
	   for(int i=0;i<=top;i++)
	   {
		   System.out.print(data[i]+" ");
	   }
   }
  }
