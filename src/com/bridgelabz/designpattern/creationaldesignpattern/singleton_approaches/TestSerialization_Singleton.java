package com.bridgelabz.designpattern.creationaldesignpattern.singleton_approaches;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerialization_Singleton {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Serialization_Singleton instanceONE = Serialization_Singleton.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Demo.ser"));
		
		out.writeObject(instanceONE);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("Demo.ser"));
		Serialization_Singleton instanceTWO = Serialization_Singleton.getInstance();
		in.close();
		
		
		System.out.println("InstanceONE HashCode : "+instanceONE.hashCode());
		System.out.println("InstanceTWO HashCode : "+instanceTWO.hashCode());
	}

}
