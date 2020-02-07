package com.bridgelabz.designpattern.structualdesignpattern.adapterdesignpattern;

import java.lang.reflect.Constructor;

public class SocketClassAdapter extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		return convertVolt(v, 40);
	}
	
	private Volt convertVolt(Volt v, int i)
	{
		return new Volt(v.getVolts()/i);
	}
	
	
	
}
