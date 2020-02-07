package com.bridgelabz.designpattern.creationaldesignpattern.singleton_approaches;

import java.io.Serializable;

public class Serialization_Singleton implements Serializable
{
	
	private static final long serialVersionUID = -7604766932017737115L;
	
	private Serialization_Singleton() {}
	
	private static class SingletonHelper
	{
		private static final Serialization_Singleton  instance = new Serialization_Singleton();
	}
	
	public static Serialization_Singleton getInstance()
	{
		return SingletonHelper.instance;
	}
}
