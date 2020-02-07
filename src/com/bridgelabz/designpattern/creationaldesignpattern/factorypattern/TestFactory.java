package com.bridgelabz.designpattern.creationaldesignpattern.factorypattern;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputer("PC", "4 GB", "1 TB", "2.4 GHZ");
		Computer server = ComputerFactory.getComputer("Server", "8 GB", "12 TB", "4.6 GHZ");
		System.out.println("PC Details : "+pc);
		System.out.println("Server Details : "+server);
	}

}
