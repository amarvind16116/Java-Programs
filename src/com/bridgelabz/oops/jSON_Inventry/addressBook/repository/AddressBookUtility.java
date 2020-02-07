package com.bridgelabz.oops.jSON_Inventry.addressBook.repository;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oops.jSON_Inventry.addressBook.model.AddressBookBEAN;
import com.bridgelabz.oops.jSON_Inventry.stockManagement.LinkedList;
import com.bridgelabz.oops.jsoninventry.addressbook.services.AddressBookService;
import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program to write method of adddress book to write details,
 *  read details, sort by last name, sort by zip 
 */

public class AddressBookUtility implements AddressBookService {
	
	private static final String PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/AddressBook.JSON";
	
	static AddressBookBEAN addressBookBean = new AddressBookBEAN();

	static JSONObject jsonObject;
	static JSONArray jsonArray;
	static JSONObject jsonMainObj;
	
	static FileWriter fileWriter;
	static FileReader fileReader;
	static Object object;

	// Method of take entries from the users
	// also append all the entries in my OWN linked list

	@SuppressWarnings({ "static-access", "unchecked" })
	public void addEntries(LinkedList linkedList) throws Exception {

		jsonObject = new JSONObject();
		jsonArray = new JSONArray();

		System.out.println("Enter First Name of person : ");
		addressBookBean.setFirstName(InputUtility.nextString());
		jsonObject.put("First_Name", addressBookBean.getFirstName());

		System.out.println("Enter the Last Name of person : ");
		addressBookBean.setLastName(InputUtility.nextString());
		jsonObject.put("Last_Name", addressBookBean.getLastName());

		System.out.println("Enter the Address of person : ");
		addressBookBean.setAddress(InputUtility.nextString());
		jsonObject.put("Address", addressBookBean.getAddress());

		System.out.println("Enter the city of person : ");
		addressBookBean.setCity(InputUtility.nextString());
		jsonObject.put("City", addressBookBean.getCity());

		System.out.println("Enter the state of person : ");
		addressBookBean.setState(InputUtility.nextString());
		jsonObject.put("State", addressBookBean.getState());

		System.out.println("Enter the pincode of city : ");
		addressBookBean.setZip(InputUtility.nextString());
		jsonObject.put("PinCode", addressBookBean.getZip());

		System.out.println("Enter the phone number of person : ");
		addressBookBean.setPhoneNum(InputUtility.nextString());
		jsonObject.put("PhoneNumber", addressBookBean.getPhoneNum());

		jsonArray.add(jsonObject);
		linkedList.append(jsonObject);
	}

	// Method for write the details of person in JSON File

	@SuppressWarnings("unchecked")
	public void writeAddressBook(LinkedList list, JSONObject obj) throws Exception {

		jsonArray = new JSONArray();
		jsonMainObj = new JSONObject();

		while (list.isEmpty() == false) {
			jsonArray.add(list.removeHead());
		}

		jsonMainObj.put("Address-Book", jsonArray);

		fileWriter = new FileWriter(PATH);
		fileWriter.write(jsonMainObj.toJSONString());
		fileWriter.close();
		System.out.println("Person detail inserted in AddresBook.JSON File");
	}

	// Method for read data from file and append it to the my OWN LinkedList
	// and then add new data in JSON File without override

	public void storedData() throws Exception {
		LinkedList<JSONObject> list = new LinkedList<JSONObject>();

		fileReader = new FileReader(PATH);
		object = new JSONParser().parse(fileReader);
		jsonObject = (JSONObject) object;
		jsonArray = (JSONArray) jsonObject.get("Address-Book");

		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject obj1 = (JSONObject) jsonArray.get(i);
			list.append(obj1);
		}
		addEntries(list);
		writeAddressBook(list, jsonObject);
	}

	// Method for read JSON File and Find person by NAme

	public void searchPerson() throws Exception {
		fileReader = new FileReader(PATH);
		object = new JSONParser().parse(fileReader);
		jsonObject = (JSONObject) object;

		jsonArray = (JSONArray) jsonObject.get("Address-Book");
		String searchingArray[] = new String[jsonArray.size()];
		String personName = null;

		System.out.print("Name of Persons are : ");
		for (int i = 0; i < jsonArray.size(); i++) {
			jsonObject = (JSONObject) jsonArray.get(i);
			personName = (String) jsonObject.get("First_Name");
			searchingArray[i] = personName;
			System.out.println(personName + " ");
		}

		System.out.println("Enter the person Name which you want to edit or delete : ");
		String name = InputUtility.nextString();

		for (int i = 0; i < searchingArray.length; i++) {
			System.out.println("Press 1. Edit\nPress 2. Delete");
			int num = InputUtility.nextInt();
			if (num == 1) {
				if (name.equals(searchingArray[i])) {
					editPersonInformation(i);
				}
			} else if (num == 2) {
				if (name.equals(searchingArray[i])) {
					deletePerson(i);
				}
			} else {
				System.out.println("Wrong key pressed");
			}

		}
	}

	// Method for edit person Details and write in JSON file

	public void editPersonInformation(int index) throws Exception {
		fileReader = new FileReader(PATH);
		object = new JSONParser().parse(fileReader);
		jsonObject = (JSONObject) object;
		jsonArray = (JSONArray) jsonObject.get("Address-Book");

		jsonMainObj = (JSONObject) jsonArray.get(index);

		String update = null;

		while (true) {
			System.out.println(
					"\t\t\t\tPress 1. Edit LastName\n\t\t\t\tPress 2. Edit Address\n\t\t\t\tPress 3. Edit State\n\t\t\t\tPress 4. Edit PinCode\n\t\t\t\tPress 5. Edit PhoneNumber\n\t\t\t\tPress 6. Edit City");
			int num = InputUtility.nextInt();
			if (num == 1) {
				System.out.println("Enter Last_Name");
				update = InputUtility.nextString();
				jsonMainObj.replace("Last_Name", update);
			} else if (num == 2) {
				System.out.println("Enter Address");
				update = InputUtility.nextString();
				jsonMainObj.replace("Address", update);
			} else if (num == 3) {
				System.out.println("Enter State");
				update = InputUtility.nextString();
				jsonMainObj.replace("State", update);
			} else if (num == 4) {
				System.out.println("Enter PinCode");
				int pin = InputUtility.nextInt();
				update = pin + "";
				jsonMainObj.replace("Address", update);
			} else if (num == 5) {
				System.out.println("Enter PhoneNumber");
				int mob = InputUtility.nextInt();
				update = mob + "";
				jsonMainObj.replace("PhoneNumber", update);
			} else if (num == 6) {
				System.out.println("Enter City");
				update = InputUtility.nextString();
				jsonMainObj.replace("City", update);
			} else {
				System.out.println("******* Wrong key pressed *******");
			}

			fileWriter = new FileWriter(PATH);
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.close();
			System.out.println(update + " is changed");

			System.out.println("If you wan to more Changes press 1 else press 2");
			int num2 = InputUtility.nextInt();
			if (num2 == 1) {
				continue;
			}

			else {
				System.out.println("********* Thanks for using *********");
				break;
			}
		}
	}

	// Method for delete the data of persons from the JSON File

	public void deletePerson(int index) throws Exception {
		fileReader = new FileReader(PATH);
		object = new JSONParser().parse(fileReader);
		jsonObject = (JSONObject) object;
		jsonArray = (JSONArray) jsonObject.get("Address-Book");

		jsonMainObj = (JSONObject) jsonArray.remove(index);

		fileWriter = new FileWriter(PATH);
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		System.out.println("********* Person details is deleted *********");
	}

	// Method for Sort the JSON File by LastName

	public void sortByLastName() throws Exception {
		LinkedList<JSONObject> list = new LinkedList<JSONObject>();

		fileReader = new FileReader(PATH);
		object = new JSONParser().parse(fileReader);
		jsonObject = (JSONObject) object;
		jsonArray = (JSONArray) jsonObject.get("Address-Book");

		String[] lastName = new String[jsonArray.size()];

		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jo = (JSONObject) jsonArray.get(i);
			String lname = (String) jo.get("Last_Name");
			lastName[i] = lname;
		}
		Arrays.sort(lastName);
		for (int i = 0; i < lastName.length; i++) {
			JSONObject jo;
			JSONObject jo1 = null;
			int count = 0;
			for (int j = 0; j < lastName.length; j++) {
				jo = (JSONObject) jsonArray.get(j);
				String lname = (String) jo.get("Last_Name");
				if (lname.equals(lastName[i])) {
					list.append(jo);
					break;
				}
			}

		}
		writeAddressBook(list, jsonObject);
	}

	// method for write the JSON file by LastName Sorting

	public void writeLastNameSorting(LinkedList list, JSONObject obj) throws Exception {

		jsonArray = new JSONArray();
		jsonMainObj = new JSONObject();

		while (list.isEmpty() == false) {
			jsonArray.add(list.removeHead());
		}

		jsonMainObj.put("Address-Book", jsonArray);

		fileWriter = new FileWriter(PATH);
		fileWriter.write(jsonMainObj.toJSONString());
		fileWriter.close();
		System.out.println("Person detail inserted in AddresBook.JSON File");
	}

	// Method for Sort the JSON File by ZIP / PinCode

	public void sortByZip() throws Exception {
		LinkedList<JSONObject> list = new LinkedList<JSONObject>();

		fileReader = new FileReader(PATH);
		object = new JSONParser().parse(fileReader);
		jsonObject = (JSONObject) object;
		jsonArray = (JSONArray) jsonObject.get("Address-Book");

		String[] pinCode = new String[jsonArray.size()];

		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject jo = (JSONObject) jsonArray.get(i);
			String zip = (String) jo.get("PinCode");
			pinCode[i] = zip;
		}
		Arrays.sort(pinCode);
		for (int i = 0; i < pinCode.length; i++) {
			JSONObject jo;
			JSONObject jo1 = null;
			int count = 0;
			for (int j = 0; j < pinCode.length; j++) {
				jo = (JSONObject) jsonArray.get(j);
				String lname = (String) jo.get("PinCode");
				if (lname.equals(pinCode[i])) {
					list.append(jo);
					break;
				}
			}

		}
		writeSortByZip(list, jsonObject);
	}

	// method for write the JSON file by ZIP Sorting

	public void writeSortByZip(LinkedList list, JSONObject obj) throws Exception {

		jsonArray = new JSONArray();
		jsonMainObj = new JSONObject();

		while (list.isEmpty() == false) {
			jsonArray.add(list.removeHead());
		}

		jsonMainObj.put("Address-Book", jsonArray);

		fileWriter = new FileWriter(PATH);
		fileWriter.write(jsonMainObj.toJSONString());
		fileWriter.close();
		System.out.println("Person detail inserted in AddresBook.JSON File");
	}

	// Method for exit from the Application

	public void exitBook() {

		System.out.println("*********** Thanks for Using ***********");
		System.exit(0);
	}
}
