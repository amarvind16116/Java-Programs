package com.bridgelabz.oops.jSON_Inventry.inventryManagement.model;


/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program have all the GETTER SETTER method of inventry management
 */

public class InventryBean {
	private static String key;
	private static String name;
	private static int weight;
	private static int price;
	private static int grandTotal;
	
	public static int getGrandTotal() {
		return grandTotal;
	}
	public static int setGrandTotal(int grandTotal) {
		return InventryBean.grandTotal = grandTotal;
	}
	public static String getKey() {
		return key;
	}
	public static String setKey(String key) {
		return InventryBean.key = key;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		InventryBean.name = name;
	}
	public static int getWeight() {
		return weight;
	}
	public static void setWeight(int weight) {
		InventryBean.weight = weight;
	}
	public static int getPrice() {
		return price;
	}
	public static void setPrice(int price) {
		InventryBean.price = price;
	}
}
