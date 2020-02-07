package com.bridgelabz.designpattern.creationaldesignpattern.singleton_approaches;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	
	public static void main(String[] args) {
		
		EagerIntialization instanceONE = EagerIntialization.getInstnce();
		
		EagerIntialization instanceTWO = null;
		
		try {
			Constructor[] constructors = EagerIntialization.class.getDeclaredConstructors();
			
			for(Constructor constructor : constructors)
			{
				// Below code will Destroy the Singleton Pattern
				
				constructor.setAccessible(true);
				
				instanceTWO = (EagerIntialization) constructor.newInstance();
				
				break;
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("InstanceONE HashCode : "+instanceONE.hashCode());
		System.out.println("InstanceTWO HashCode : "+instanceTWO.hashCode());
		
	}		
				
}
