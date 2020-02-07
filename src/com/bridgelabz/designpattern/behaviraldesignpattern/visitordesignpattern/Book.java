package com.bridgelabz.designpattern.behaviraldesignpattern.visitordesignpattern;

public class Book implements ItemElement {

	private int price;
	private String isbnNumber;
	
	public Book(int cost, String isbn) {
		// TODO Auto-generated constructor stub
		this.price = cost;
		this.isbnNumber = isbn;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String getISBNnumber()
	{
		return isbnNumber;
	}
	
	@Override
	public int accept(ShoppingCart visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}
