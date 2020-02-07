package com.bridgelabz.designpattern.behaviraldesignpattern.observerdesignpattern;

import java.util.Observer;

public interface Subject {
	
	public void register(Observer obj);
	
	public void unRegister(Observer obj);
	
	
	public void notifyObervers();
	
	public Object getUpdate(Observer obj);
	
}
