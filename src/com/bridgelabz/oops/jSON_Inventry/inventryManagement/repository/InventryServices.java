package com.bridgelabz.oops.jSON_Inventry.inventryManagement.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.jSON_Inventry.inventryManagement.model.InventryBean;
import com.bridgelabz.oops.jSON_Inventry.inventryManagement.i_services.InventryInterface;
import com.bridgelabz.utils.InputUtility;

/**
 * @author Arvind
 *  Date: 3/12/2019 
 *  purpose: program have method to read data from file and write data in file in JSON format
 */

public class InventryServices implements InventryInterface {

	private static final String PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/WriteFile.JSON";
	private static final String READ_PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/readFile.JSON";
	InventryBean inventrybean = new InventryBean();
	@Override
	public void writeFile() {
		JSONObject jo1 = new JSONObject();
		System.out.print("How much invetnry you want : ");
		int num = InputUtility.nextInt();

		while (num > 0) {

			System.out.println("Enter the key for Inventry (Rice,Wheat,Pulses): ");

			String str = inventrybean.setKey(InputUtility.nextString());
			if (inventrybean.getKey().equalsIgnoreCase("rice") || inventrybean.getKey().equalsIgnoreCase("wheat")
					|| inventrybean.getKey().equalsIgnoreCase("pulses")) {

				JSONArray jarr = new JSONArray();

				System.out.println("How many types of " + inventrybean.getKey() + " you want to add");
				int num2 = InputUtility.nextInt();
				while (num2 > 0) {
					JSONObject jo = new JSONObject();

					System.out.print("Enter the varaitey name of " + inventrybean.getKey() + " : ");
					inventrybean.setName(InputUtility.nextString());
					jo.put("Name", inventrybean.getName());

					System.out.print("Enter the Weight of " + inventrybean.getKey() + " : ");
					inventrybean.setWeight(Integer.parseInt(InputUtility.nextString()));
					jo.put("Weight", inventrybean.getWeight());

					System.out.print("Enter the Price of " + inventrybean.getKey() + " : ");
					inventrybean.setPrice((Integer.parseInt(InputUtility.nextString())));
					jo.put("Price", inventrybean.getPrice());

					inventrybean.setGrandTotal((inventrybean.getWeight() * inventrybean.getPrice()));
					System.out.println("Now Grand Total is generate automatically " + inventrybean.getKey() + " : "
							+ inventrybean.getGrandTotal());
					jo.put("GrandTotal", inventrybean.getGrandTotal());
					jarr.add(jo);
					num2--;
				}
				jo1.put(str, jarr);
				num--;
			} else {
				System.out.println("===============>> OOPs You Entered Wrong Value <<===============");
			}

		}
		FileWriter fw;
		try {
			fw = new FileWriter(PATH);

			fw.write(jo1.toJSONString());

			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Successfully Write in JSON FIle");
	}

	@Override
	public void readFile() {

		// JSON parser object to parse read File
		JSONParser jsonParser = new JSONParser();

		FileReader fr = null;
		Object obj = null;
		try {
			fr = new FileReader(READ_PATH);
			try {
				obj = jsonParser.parse(fr);
			} 
			catch (IOException | ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// typecasting obj to JSONObject
		JSONObject jsonObj = (JSONObject) obj;

		System.out.println("Rice : \n");
		// rice details

		JSONArray rice = (JSONArray) jsonObj.get("Rice");

		for (int i = 0; i < rice.size(); i++) {
			JSONObject jo = (JSONObject) rice.get(i);
			System.out.println(
					"name : " + jo.get("name") + " weight : " + jo.get("weight") + " price : " + jo.get("price"));
		}

		System.out.println("Wheat : \n");
		// rice details

		JSONArray wheat = (JSONArray) jsonObj.get("Wheat");

		for (int i = 0; i < wheat.size(); i++) {
			JSONObject jo = (JSONObject) rice.get(i);
			System.out.println(
					"name : " + jo.get("name") + " weight : " + jo.get("weight") + " price : " + jo.get("price"));
		}

	}

}
