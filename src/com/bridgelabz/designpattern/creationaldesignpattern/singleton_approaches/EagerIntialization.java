package com.bridgelabz.designpattern.creationaldesignpattern.singleton_approaches;

public class EagerIntialization {
	
	private static final EagerIntialization instance = new EagerIntialization();
	
	private EagerIntialization() 
	{
		// Private Constructor to avoid client application to use constructor
	}
	
	public static EagerIntialization getInstnce()
	{
		return instance;
	}
}
