package com.bridgelabz.oops.jSON_Inventry.addressBook.model;

// This class have getter setter method of all the details of person
// Like address book holds a collection of entries, each recording a person's 
// first and last names, address, city, state, zip, and hone number.

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: This class have getter setter method of all the details of person Like address book holds 
 *  a collection of entries, each recording a person's  first and last names, address, city, state, zip, 
 *  and hone number.
 */

public class AddressBookBEAN {
	
	private static String firstName;
	private static String lastName;
	private static String address;
	private static String city;
	private static String state;
	private static String zip;
	private static String phoneNum;
	
	public static String getFirstName() {
		return firstName;
	}
	public static String setFirstName(String firstName) {
		return AddressBookBEAN.firstName = firstName;
	}
	
	public static String getLastName() {
		return lastName;
	}
	public static String setLastName(String lastName) {
		return AddressBookBEAN.lastName = lastName;
	}
	
	public static String getAddress() {
		return address;
	}
	public static String setAddress(String address) {
		return AddressBookBEAN.address = address;
	}
	
	public static String getCity() {
		return city;
	}
	public static String setCity(String city) {
		return AddressBookBEAN.city = city;
	}
	
	public static String getState() {
		return state;
	}
	public static String setState(String state) {
		return AddressBookBEAN.state = state;
	}
	
	public static String getZip() {
		return zip;
	}
	public static String setZip(String zip) {
		return AddressBookBEAN.zip = zip;
	}
	
	public static String getPhoneNum() {
		return phoneNum;
	}
	public static String setPhoneNum(String phoneNum) {
		return AddressBookBEAN.phoneNum = phoneNum;
	}
	
	
	
}
