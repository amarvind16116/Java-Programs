package com.bridgelabz.designpattern.creationaldesignpattern.singleton_approaches;

public class Static_Block_Intialization {
	
	private static Static_Block_Intialization instance ;
	
	private Static_Block_Intialization()	{}
	
	// Static block initialization for Exception Handling
	
	static {
		try
		{
			instance = new Static_Block_Intialization();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured in creating singleton class");
		}
	}
	
	public static Static_Block_Intialization getInstance()
	{
		return instance;
		
	}
	
}
