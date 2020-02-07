package com.bridgelabz.oops.jSON_Inventry.inventryManagement.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oops.jSON_Inventry.inventryManagement.InventryBean;
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
	
	@Override
	public void writeFile() {
		JSONObject jo1 = new JSONObject();
		System.out.print("How much invetnry you want : ");
		int num = InputUtility.nextInt();

		while (num > 0) {

			System.out.println("Enter the key for Inventry (Rice,Wheat,Pulses): ");

			String str = InventryBean.setKey(InputUtility.nextString());
			if (InventryBean.getKey().equalsIgnoreCase("rice") || InventryBean.getKey().equalsIgnoreCase("wheat")
					|| InventryBean.getKey().equalsIgnoreCase("pulses")) {

				JSONArray jarr = new JSONArray();

				System.out.println("How many types of " + InventryBean.getKey() + " you want to add");
				int num2 = InputUtility.nextInt();
				while (num2 > 0) {
					JSONObject jo = new JSONObject();

					System.out.print("Enter the varaitey name of " + InventryBean.getKey() + " : ");
					InventryBean.setName(InputUtility.nextString());
					jo.put("Name", InventryBean.getName());

					System.out.print("Enter the Weight of " + InventryBean.getKey() + " : ");
					InventryBean.setWeight(Integer.parseInt(InputUtility.nextString()));
					jo.put("Weight", InventryBean.getWeight());

					System.out.print("Enter the Price of " + InventryBean.getKey() + " : ");
					InventryBean.setPrice((Integer.parseInt(InputUtility.nextString())));
					jo.put("Price", InventryBean.getPrice());

					InventryBean.setGrandTotal((InventryBean.getWeight() * InventryBean.getPrice()));
					System.out.println("Now Grand Total is generate automatically " + InventryBean.getKey() + " : "
							+ InventryBean.getGrandTotal());
					jo.put("GrandTotal", InventryBean.getGrandTotal());
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
