package com.bridgelabz.designpattern.behaviraldesignpattern.visitordesignpattern;

public class ShoppingCartRun {

	private static int calculator(ItemElement[] items)
	{
		ShoppingCartImplementation cart = new ShoppingCartImplementation();
		int sum = 0;
		for(ItemElement item : items)
			sum = sum + item.accept(cart);
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ItemElement[] items = new ItemElement[]
				{
						new Book(50, "4856142"),new Book(45, "8468465"),
						new Fruit(10, 2, "Banana"),new Fruit(15, 1, "Apple")
				};
		int total = calculator(items);
		System.out.println("Total Cost : "+total);
	}

}
