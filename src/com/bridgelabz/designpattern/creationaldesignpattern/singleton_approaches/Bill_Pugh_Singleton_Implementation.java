package com.bridgelabz.designpattern.creationaldesignpattern.singleton_approaches;

public class Bill_Pugh_Singleton_Implementation {

	private Bill_Pugh_Singleton_Implementation() {}
	
	private static class SingeltonHelper
	{
		private static final Bill_Pugh_Singleton_Implementation INSTANCE = new Bill_Pugh_Singleton_Implementation();
	}
	
	public static Bill_Pugh_Singleton_Implementation getInstance()
	{
		return SingeltonHelper.INSTANCE;
	}
}
