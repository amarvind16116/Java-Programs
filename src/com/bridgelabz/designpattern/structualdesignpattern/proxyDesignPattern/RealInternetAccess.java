package com.bridgeLabz.designPattern.structualDesignPattern.proxyDesignPattern;

public class RealInternetAccess implements OfficeInternetAccess
{
	
	private String empName;
	
	public RealInternetAccess(String empName) {
		// TODO Auto-generated constructor stub
		this.empName = empName;
	}
	
	
	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		System.out.println("Internet Access Granted to employee : "+empName);
	}
	
}
