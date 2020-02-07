package com.bridgelabz.designpattern.creationaldesignpattern.singleton_approaches;


public class RunnerSingelton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill_Pugh_Singleton_Implementation billPugh = Bill_Pugh_Singleton_Implementation.getInstance();
		
		Lazy_Initialization lazyInitialization = Lazy_Initialization.getInstance();
		
		Serialization_Singleton	serialization_Singleton = Serialization_Singleton.getInstance();
		
		Static_Block_Intialization staticBlock = Static_Block_Intialization.getInstance();
		
		Thread_Safe_Singleton threadSafe = Thread_Safe_Singleton.getInstance();
		
		System.out.println("Bill_Pugh_Singleton_Implementation : "+billPugh.hashCode());
		System.out.println("Lazy_Initialization : "+lazyInitialization.hashCode());
		System.out.println("Serialization_Singleton : "+serialization_Singleton.hashCode());
		System.out.println("Static_Block_Intialization : "+staticBlock.hashCode());
		System.out.println("Thread_Safe_Singleton : "+threadSafe.hashCode());
		
	}

}
