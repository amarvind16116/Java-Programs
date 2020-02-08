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
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNum;
	
	public String getFirstName() {
		return firstName;
	}
	public String setFirstName(String firstName) {
		return this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public String setLastName(String lastName) {
		return this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	public String setAddress(String address) {
		return this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	public String setCity(String city) {
		return this.city = city;
	}
	
	public  String getState() {
		return state;
	}
	public String setState(String state) {
		return this.state = state;
	}
	
	public  String getZip() {
		return zip;
	}
	public  String setZip(String zip) {
		return this.zip = zip;
	}
	
	public  String getPhoneNum() {
		return phoneNum;
	}
	public String setPhoneNum(String phoneNum) {
		return this.phoneNum = phoneNum;
	}
	
	
	
}
