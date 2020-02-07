package com.bridgelabz.designpattern.behaviraldesignpattern.observerdesignpattern;

import java.util.*;

public class MyTopic implements Subject{
		
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();
	
	public MyTopic() {
		// TODO Auto-generated constructor stub
		this.observers = new ArrayList<>();
	}
	

	@Override
	public void register(java.util.Observer obj) {
		// TODO Auto-generated method stub
		if(obj == null) throw new NullPointerException("Null Observers");
		synchronized (MUTEX) {
			if(!observers.contains(obj))
				observers.add((Observer) obj);
		}
	}

	@Override
	public void unRegister(java.util.Observer obj) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
			observers.remove(obj);
		}
	}

	@Override
	public void notifyObervers() {
		// TODO Auto-generated method stub
		List<Observer> localObservers = null;
		if(!changed)
			return;
		localObservers = new ArrayList<>(this.observers);
		this.changed = false;
		
		for(Observer obj : localObservers)
		{
			obj.update();
		}	
	}

	@Override
	public Object getUpdate(java.util.Observer obj) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	public void postMessage(String msg)
	{
		System.out.println("Message posted to topic "+msg);
		this.message = msg;
		this.changed = true;
		notifyObervers();
	}
	
}
