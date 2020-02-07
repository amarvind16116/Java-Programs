package com.bridgelabz.designpattern.structualdesignpattern.adapterdesignpattern;

import com.bridgelabz.designpattern.structualdesignpattern.adapterdesignpattern.SocketAdapter;
import com.bridgelabz.designpattern.structualdesignpattern.adapterdesignpattern.SocketClassAdapter;
import com.bridgelabz.designpattern.structualdesignpattern.adapterdesignpattern.SocketObjectAdapter;
import com.bridgelabz.designpattern.structualdesignpattern.adapterdesignpattern.Volt;

public class AdapterPatternTest {

	private static Volt	getVolt(SocketAdapter sock , int i)
	{
		switch(i)
		{
		case 3 :
			return sock.get3Volt();
			
		case 12 : 
			return sock.get12Volt();
			
		case 120 : 
			return sock.get120Volt();
		default : 
			return sock.get120Volt();
		}
	}
	
	
	private static void testObjectAdapter()
	{
		SocketAdapter sa = new SocketObjectAdapter();
		Volt v3 = getVolt(sa, 3);
		Volt v12 = getVolt(sa, 12);
		Volt v120 = getVolt(sa, 120);
		
		System.out.println("v3 volts using Object Adapter : "+v3.getVolts());
		System.out.println("v12 volts using Object Adapter : "+v12.getVolts());
		System.out.println("v120 volts using Object Adapter : "+v120.getVolts());
	}
	
	private static void testClassAdapter()
	{
		SocketAdapter sa = new SocketClassAdapter();
		Volt v3 = getVolt(sa, 3);
		Volt v12 = getVolt(sa, 12);
		Volt v120 = getVolt(sa, 120);
		
		System.out.println("\nv3 volts using Object Adapter : "+v3.getVolts());
		System.out.println("v12 volts using Object Adapter : "+v12.getVolts());
		System.out.println("v120 volts using Object Adapter : "+v120.getVolts());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testObjectAdapter();
		testClassAdapter();
	}

}
