package com.bridgelabz.oops.jSON_Inventry.stockManagement;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  Program have add or remove values from the file without overwiing
 * @date     19-11-19
 *************************************************************************************/


public class StockAccountLinkedList {
	
	private static final String PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/StockAccount.JSON";
	
	static StockManagementBean stockmanagementbean = new StockManagementBean();
	
	public static void addValues(LinkedList l)
	{
		System.out.println("Enter new Company name:");
		stockmanagementbean.setStockName(InputUtility.nextString());
		System.out.println("Enter Stock value");
		stockmanagementbean.setStockShares(InputUtility.nextString());
		System.out.println("Enter per Stock value");
		stockmanagementbean.setPersharePrice(InputUtility.nextInt());
		JSONArray arr=new JSONArray();
		JSONObject obj1=new JSONObject();
		obj1.put("name", stockmanagementbean.getStockName());
		obj1.put("stock", stockmanagementbean.getStockShares());
		obj1.put("perSharePrice", stockmanagementbean.getPersharePrice()+"");
		arr.add(obj1);
		l.append(obj1);
		l.display();
	}

	public static void writeValues(LinkedList l) throws Exception
	{
		System.out.println(l.size());
		JSONObject jo = new JSONObject();
		JSONArray jarr = new JSONArray();
		while(l.isEmpty()==false)
		{
			jarr.add(l.removeHead());
		}
		jo.put("company1", jarr);
		FileWriter file=new FileWriter(PATH);
		file.write(jo.toJSONString());
		file.close();
		System.out.println("Values Written in json file");
	}
	
	public static void main(String[] args) throws Exception {
		
		LinkedList<JSONObject> l=new LinkedList<JSONObject>();
		
		FileReader file=new FileReader(PATH);
		Object a=new JSONParser().parse(file);
		JSONObject obj=(JSONObject)a;
		JSONArray arr=(JSONArray)obj.get("company");
		for(int i=0;i<arr.size();i++)
		{
		  JSONObject obj1 = (JSONObject) arr.get(i);
				  l.append(obj1);
		}
		
		while(true)
		{
			System.out.println();
			System.out.println("Press 1 to Continue else press 2");
			int num = InputUtility.nextInt();
			if(num==1) {
				addValues(l);
			}
			else if(num==2) {
				System.out.println("Terminate");
				break;
			}
			else {
				System.out.println("Wrong value entered");
			}
		}
		writeValues(l);
	}
	
}
