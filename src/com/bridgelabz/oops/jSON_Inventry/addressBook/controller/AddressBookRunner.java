package com.bridgelabz.oops.jSON_Inventry.addressBook.controller;

import com.bridgelabz.oops.jSON_Inventry.addressBook.repository.AddressBookUtility;
import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to control the address book methods
 */

public class AddressBookRunner {

	public static void main(String[] args) throws Exception {
		AddressBookUtility utility = new AddressBookUtility();
		int n = 10;
		while (n != 0) {
			System.out.println(
					"Press 1. Add Person Details\nPress 2. Edit OR Delete Person Details\nPress 3. Sort By Last Name\nPress 4. Sort By Zip\nPress 5. Exit");
			int num = InputUtility.nextInt();

			if (num == 1) {
				utility.storedData();
			} else if (num == 2) {
				utility.searchPerson();
			} else if (num == 3) {
				utility.sortByLastName();
			} else if (num == 4) {
				utility.sortByZip();
			} else if (num == 5) {
				utility.exitBook();
				break;
			} else {
				System.out.println("Wrong key Pressed");
			}
			n++;
		}

	}

}
