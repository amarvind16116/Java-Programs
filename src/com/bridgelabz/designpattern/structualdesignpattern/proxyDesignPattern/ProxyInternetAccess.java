package com.bridgeLabz.designPattern.structualDesignPattern.proxyDesignPattern;

public class ProxyInternetAccess implements OfficeInternetAccess
{
	private String employeeName;
	
	private RealInternetAccess realAccess;
	
	public ProxyInternetAccess(String employeeName) {
		// TODO Auto-generated constructor stub
		this.employeeName = employeeName;
	}
	

	@Override
	public void grantInternetAccess() {
		// TODO Auto-generated method stub
		if(getRole(employeeName)>4)
		{
			realAccess = new RealInternetAccess(employeeName);
			
			realAccess.grantInternetAccess();
		}
	}

	public int getRole(String empName)
	{
		System.out.println("CEO of Nokia Network & Solutions");
		
		return 9;
	}
	
}
