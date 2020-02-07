package com.bridgelabz.designpattern.behaviraldesignpattern.visitordesignpattern;

public interface ShoppingCart {
		
	int visit(Book book);
	
	int visit(Fruit fruit);
}
