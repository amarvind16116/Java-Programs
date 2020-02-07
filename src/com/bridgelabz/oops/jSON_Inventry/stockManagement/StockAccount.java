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
 * @purpose  program have methods to print stock of companies and buy stocks and 
 * 			 after implented than write in file
 * @date     19-11-19
 *************************************************************************************/


public class StockAccount {
	
	static JSONObject mainJOBJ = new JSONObject();
	
	private static final String PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/StockAccount.JSON";
	private static final String BUYER_PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/StockBuyer.JSON";
	
	public static void printStock(int num) throws Exception {
		FileReader fr = new FileReader(PATH);
		Object o = new JSONParser().parse(fr);
		JSONObject jo = (JSONObject) o;
		JSONArray jarr = (JSONArray) jo.get("company");
			JSONObject jobj = (JSONObject) jarr.get(num);
			String str = (String) jobj.get("stock");
			String str2 = (String) jobj.get("perSharePrice");
			
			System.out.println("\t __________________________");
			System.out.println("\t| stock\t   | perStockPrice |");
			System.out.println("\t|__________|_______________|");
			System.out.println("\t| "+str+"\t   | "+str2+"\t\t   |");	
			System.out.println("\t|__________|_______________|\n\n");
			
			buyStock(str, str2);
			writeCompanyFile(num);
	}
	
	public static void buyStock(String str , String str2) throws Exception {
		int stock = Integer.parseInt(str);
		int perSharePrice = Integer.parseInt(str2);
		System.out.println("How much shares you want to buy : ");
		int stockBy = InputUtility.nextInt();
		
		if(stock<stockBy) {
			System.out.println("We have Only "+stock);
			return;
		}
		
		int stockByAmmount = stockBy*perSharePrice;
		System.out.println("This is the ammount of share : "+stockByAmmount);
		System.out.println("If you want to buy the ammount than press 1");
		int num = InputUtility.nextInt();
	
			if(num==1) {
				stock = stock-stockBy;
				writeFileBuyer(stockBy, stockByAmmount);
				System.out.println("Successfully bought shares");
			}
			else {
				System.out.println("You declined");
			}
			
	}
	
	public static void writeFileBuyer(int stockBy,int stockByAmmount) throws Exception {
		System.out.println("==========================>> Before buy you have to create account <<==========================");
		
		JSONArray jarr = new JSONArray();
		 
			JSONObject jo = new JSONObject();
			
			System.out.print("Enter the First Name of Customer : ");
			StockBuyerBean.setFirstName(InputUtility.nextString());
			jo.put("customer_First_Name", StockBuyerBean.getFirstName());
			
			System.out.print("Enter the Last name of Customer : ");
			StockBuyerBean.setLastName(InputUtility.nextString());
			jo.put("Customer_Last_Name", StockBuyerBean.getLastName());
			
			StockBuyerBean.setTotalBoughtShare(stockBy);
			jo.put("TotalShare", StockBuyerBean.getTotalBoughtShare());
			
			StockBuyerBean.setTotalPrice(stockByAmmount);
			jo.put("TotalPRiceOfShares", StockBuyerBean.getTotalPrice());
			jarr.add(jo);

		System.out.println("Enter the UerName of Customer");
		mainJOBJ.put(InputUtility.nextString(), jarr);

		@SuppressWarnings("resource")
		FileWriter fw = new FileWriter(BUYER_PATH);
		fw.write(mainJOBJ.toJSONString());
		
		fw.flush();
		
		System.out.println("Successfully Write in StockBuyer.JSON FIle");
		
	}
	
	public static void writeCompanyFile(int num) throws Exception {
		FileReader fr = new FileReader(PATH);
		Object o = new JSONParser().parse(fr);
		JSONObject jo = (JSONObject) o;
		JSONArray jarr = (JSONArray) jo.get("company");
		JSONObject jo1 = (JSONObject) jarr.get(num);
		String stock = (String) jo1.get("stock");
		int convertStock = Integer.parseInt(stock);
		
		@SuppressWarnings("static-access")
		int updateStock = convertStock-StockBuyerBean.getTotalBoughtShare();
		if(stock==null) {
			System.out.println("Share is OUT OF Stock");
		}
		else if(convertStock<StockBuyerBean.getTotalBoughtShare()) {
			System.out.println("We have only "+stock);
		}
		else {
			String update = updateStock+"";
			jo1.replace("stock", update);
		}
		@SuppressWarnings("resource")
		FileWriter fw = new FileWriter(PATH);
		fw.write(jo.toJSONString());
		
		fw.flush();
		
		System.out.println("Successfully update  StockAccount.JSON FIle");
		
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader(PATH);
		Object o = new JSONParser().parse(fr);
		JSONObject jo = (JSONObject) o;
		JSONArray jarr = (JSONArray) jo.get("company");
		String[] array = new String[jarr.size()];
		System.out.println("==========================>> We have below Companies Shares <<==========================");
		for(int i=0; i<jarr.size(); i++) 
		{
			JSONObject jo1 = (JSONObject) jarr.get(i);
			String str = (String) jo1.get("name");
			System.out.println(str);
		}
		
		System.out.println("Please enter the company name to see the Stock and ammount : ");
		String name = InputUtility.nextString();
		System.out.println(name);
		while(true) {
			switch(name) {
			
			case "TCS" : {
				StockBuyerBean.setCompanyName(name);
				printStock(0);
				break;
			}
			case "Infosys" : {
				StockBuyerBean.setCompanyName(name);
				printStock(1);
				break;
			}
			case "Reliance" : {
				StockBuyerBean.setCompanyName(name);
				printStock(2);
				break;
			}
			case "Accenture" : {
				StockBuyerBean.setCompanyName(name);
				printStock(3);
				break;
			}
			default :
				System.out.println("Wrong company Entered ");
				break;
	}
			System.out.print("If you dont want to buy press 1 : ");
			if (InputUtility.nextInt()==1) {
				break;
			}
			else {
				continue;
			}			
		}
	}
}
