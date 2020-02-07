package com.bridgeLabz.designPattern.structualDesignPattern.proxyDesignPattern;

public class ProxyPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OfficeInternetAccess access = new ProxyInternetAccess("Sanjeev Suri");
		
		access.grantInternetAccess();
		
	}

}
