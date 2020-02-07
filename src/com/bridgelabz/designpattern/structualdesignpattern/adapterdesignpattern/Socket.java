package com.bridgelabz.designpattern.structualdesignpattern.adapterdesignpattern;

public class Socket {
	
	public Volt getVolt()
	{
		return new Volt(120);
	}
	
}
