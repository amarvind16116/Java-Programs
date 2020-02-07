package com.bridgelabz.designpattern.creationaldesignpattern.factorypattern;

public class ComputerFactory {

		// TODO Auto-generated method stub
		public static Computer getComputer(String type, String ram, String hdd, String cpu)
		{
			if("PC".equalsIgnoreCase(type))
			{
				return new PC(ram, hdd, cpu);
			}
			else if("Server".equalsIgnoreCase(type))
			{
				return new Server(ram, hdd, cpu);
			}
			else
			{
				return null;
			}
			
		}
}
