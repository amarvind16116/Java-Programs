package com.bridgelabz.designpattern.behaviraldesignpattern.observerdesignpattern;

public class ObserverPatternRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTopic m = new MyTopic();
		
		Observer obj1 = new MyTpoicSubscriber("Karan");
		Observer obj2 = new MyTpoicSubscriber("Rohit");
		Observer obj3 = new MyTpoicSubscriber("Deepak");
		
		m.register((java.util.Observer) obj1);
		m.register((java.util.Observer) obj2);
		m.register((java.util.Observer) obj3);
		
		obj1.setSubject(m);
		obj2.setSubject(m);
		obj3.setSubject(m);
		
		obj1.update();
		
		m.postMessage("  Running  ");
	}

}
