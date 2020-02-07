package com.bridgelabz.designpattern.creationaldesignpattern.singleton_approaches;

public class Lazy_Initialization {
	
	private static Lazy_Initialization instance;
	
	private Lazy_Initialization() {}
	
	public static Lazy_Initialization getInstance()
	{
		if(instance == null)
		{
			instance = new Lazy_Initialization();
		}
		return instance;
	}
	
}
