package com.bridgelabz.designpattern.creationaldesignpattern.factorypattern;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	@Override
	public String toString()
	{
		return "RAM : "+getRAM()+", HDD : "+getHDD()+", CPU : "+getCPU();
	}
}