package com.bridgelabz.designpattern.behaviraldesignpattern.visitordesignpattern;

public class ShoppingCartImplementation implements ShoppingCart{

	@Override
	public int visit(Book book) {
		// TODO Auto-generated method stub
		int cost = 0;
		if(book.getPrice() > 50)
		{
			cost = book.getPrice()-5;
		}
		else
		{
			cost = book.getPrice();
		}
		System.out.println("Book ISBN Number "+book.getISBNnumber()+" Cost : "+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		// TODO Auto-generated method stub
		int cost = fruit.getPricePerKG()*fruit.getWeight();
		System.out.println("Fruit Name : "+fruit.getName()+" Weight : "+fruit.getWeight()+" Price : "+cost);
		return cost;
		
	}

}
