package com.bridgelabz.designpattern.behaviraldesignpattern.observerdesignpattern;

public class MyTpoicSubscriber implements Observer 
{
	
	private String name;
	private Subject topic;
	
	public MyTpoicSubscriber(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg = (String) topic.getUpdate((java.util.Observer) this);
		if(msg == null)
			System.out.println(name+" : No new message");
		else
			System.out.println(name+" : Consuming Message : "+msg);
	}

	@Override
	public void setSubject(Subject sb) {
		// TODO Auto-generated method stub
		this.topic = sb;
	}
	
}
