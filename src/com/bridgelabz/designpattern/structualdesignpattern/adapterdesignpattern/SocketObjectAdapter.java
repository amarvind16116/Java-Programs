package com.bridgelabz.designpattern.structualdesignpattern.adapterdesignpattern;

public class SocketObjectAdapter implements SocketAdapter{
	
	Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		// TODO Auto-generated method stub
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v = socket.getVolt();
		return convertVolt(v, 40);
	}

	private static Volt convertVolt(Volt v, int i)
	{
		return new Volt(v.getVolts()/i);
	}
	
}
