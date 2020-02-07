package com.bridgelabz.designpattern.behaviraldesignpattern.visitordesignpattern;

public class Fruit implements ItemElement
{
	
	private int pricePerKG;
	private int weight;
	private String name;
	
	public Fruit(int price, int weight, String name) {
		// TODO Auto-generated constructor stub
		this.pricePerKG = price;
		this.weight = weight;
		this.name = name;
	}
	
	public int getPricePerKG()
	{
		return pricePerKG;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCart visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
}
