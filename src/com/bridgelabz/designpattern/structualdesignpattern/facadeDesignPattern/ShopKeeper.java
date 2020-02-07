package com.bridgeLabz.designPattern.structualDesignPattern.facadeDesignPattern;

public class ShopKeeper {

	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop oneplus;
	
	public ShopKeeper()
	{
		iphone = new IPhone();
		samsung = new Samsung();
		oneplus = new OnePlus();
	}
	
	public void iphoneSale()
	{
		iphone.modelNo();
		iphone.price();
	}
	
	public void samsungSale()
	{
		samsung.modelNo();
		samsung.price();
	}
	
	public void oneplusSale()
	{
		oneplus.modelNo();
		oneplus.price();
	}
	
}
