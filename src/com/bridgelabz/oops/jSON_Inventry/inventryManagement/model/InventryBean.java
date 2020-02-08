package com.bridgelabz.oops.jSON_Inventry.inventryManagement.model;


/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program have all the GETTER SETTER method of inventry management
 */

public class InventryBean {
	private String key;
	private String name;
	private int weight;
	private int price;
	private int grandTotal;
	
	public int getGrandTotal() {
		return grandTotal;
	}
	public int setGrandTotal(int grandTotal) {
		return this.grandTotal = grandTotal;
	}
	public String getKey() {
		return key;
	}
	public String setKey(String key) {
		return this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
