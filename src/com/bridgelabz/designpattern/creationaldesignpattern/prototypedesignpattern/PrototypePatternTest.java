package com.bridgelabz.designpattern.creationaldesignpattern.prototypedesignpattern;

import java.util.ArrayList;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		DemoEmployee emp = new DemoEmployee();
		emp.loadData();
	
		// Use the clone method to get the DemoEmployee Object
		DemoEmployee empONE = (DemoEmployee) emp.clone();
		DemoEmployee empTWO = (DemoEmployee) emp.clone();
		
		ArrayList<String> list = empONE.getEmpList();
		list.add("Something");
		
		ArrayList<String> list1 = empTWO.getEmpList();
		list.remove("Karan");
		
		System.out.println("Employee List : "+emp.getEmpList());
		System.out.println("empONE List : "+list);
		System.out.println("empTWO List : "+list1);
	}
}
