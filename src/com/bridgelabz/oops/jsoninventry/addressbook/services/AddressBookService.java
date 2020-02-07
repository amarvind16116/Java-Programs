package com.bridgelabz.oops.jsoninventry.addressbook.services;

import org.json.simple.JSONObject;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to set abstract methods
 */

import com.bridgelabz.oops.jSON_Inventry.stockManagement.LinkedList;

public interface AddressBookService {

	// Abstract method for add Entries of person
	public void addEntries(LinkedList<?> linkedList) throws Exception;

	// Abstract method for write person details in JSON file
	public void writeAddressBook(LinkedList<?> linkedList, JSONObject jsonObject) throws Exception;

	// Abstract method for search person details
	public void searchPerson() throws Exception;

	// Abstract method for stored data in my own LinkedList
	public void storedData() throws Exception;

	// Abstract method for sort JSON data by Last NAme Wise
	public void sortByLastName() throws Exception;

	// Abstract method for edit person details
	public void editPersonInformation(int index) throws Exception;

	// Abstract method for delete person data
	public void deletePerson(int index) throws Exception;

	// Abstract method for sort JSON data by zip wise
	public void sortByZip() throws Exception;

	// Abstract method for exit from Application
	public void exitBook() throws Exception;

}
