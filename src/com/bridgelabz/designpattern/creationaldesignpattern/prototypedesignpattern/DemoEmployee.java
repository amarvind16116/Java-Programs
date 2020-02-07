package com.bridgelabz.designpattern.creationaldesignpattern.prototypedesignpattern;

import java.awt.List;
import java.util.ArrayList;

public class DemoEmployee implements Cloneable{
		
private ArrayList<String> empList;
	
	public DemoEmployee(){
		empList = new ArrayList<String>();
	}
	
	public DemoEmployee(ArrayList<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("Arvind");
		empList.add("Karan");
	}
	
	public ArrayList<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		ArrayList<String> temp = new ArrayList<String>();
		for(String s : this.getEmpList())
			temp.add(s);
		
		return new DemoEmployee(temp);
		
	}
}
	
