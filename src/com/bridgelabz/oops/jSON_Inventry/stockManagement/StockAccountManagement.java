package com.bridgelabz.oops.jSON_Inventry.stockManagement;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utils.InputUtility;

/*************************************************************************************
 * @author Arvind kumar
 * @Version 1.0
 * @purpose program have main method who control the stock management system
 * @date 19-11-19
 *************************************************************************************/

public class StockAccountManagement {

	private static final String PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/Stock.JSON";
	private static final String REPORT_PATH = "/home/admin1/Desktop/Arvind/FellowShip/Lib/StockReport.JSON";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StockManagementBean stockmanagementbean = new StockManagementBean();

		JSONObject obj1 = new JSONObject();
		JSONObject obj2 = new JSONObject();

		System.out.print("How much share you want : ");
		int num = InputUtility.nextInt();
		int i = 1;
		while (num > 0) {

			JSONObject jo = new JSONObject();
			JSONArray arr = new JSONArray();

			JSONObject jo1 = new JSONObject();
			JSONArray arr1 = new JSONArray();

			System.out.print("Enter the name of Stock Share : ");
			stockmanagementbean.setStockName(InputUtility.nextString());
			jo.put("Stock_Name", stockmanagementbean.getStockName());
			jo1.put("Stock_Name", stockmanagementbean.getStockName());

			System.out.print("Enter the number of shares : ");
			stockmanagementbean.setStockShares(InputUtility.nextString());
			jo.put("Number_OF_Shares", stockmanagementbean.getStockShares());
			jo1.put("Number_OF_Shares", stockmanagementbean.getStockShares());

			System.out.print("Enter the total amount of shares : ");
			stockmanagementbean.setSharePrice(InputUtility.nextDouble());
			jo.put("SharePrice", stockmanagementbean.getSharePrice());
			jo1.put("SharePrice", stockmanagementbean.getSharePrice());

			stockmanagementbean.setPersharePrice(
					stockmanagementbean.getSharePrice() / Integer.parseInt(stockmanagementbean.getStockShares()));
			jo1.put("Per_SharePrice", stockmanagementbean.getPersharePrice());

			arr.add(jo);
			arr1.add(jo1);
			obj1.put("Stock" + i, arr);

			obj2.put("STOCK_REPORT" + i, arr1);
			num--;
			i++;
		}

		FileWriter fw;
		try {
			fw = new FileWriter(PATH);
			fw.write(obj1.toJSONString());
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Data Inserted in JSON File");

		System.out.print("Press 1 for make STOCK-REPORT : ");
		int press = InputUtility.nextInt();
		if (press == 1) {
			FileWriter fw1;
			try {
				fw1 = new FileWriter(REPORT_PATH);
				fw1.write(obj2.toJSONString());
				fw1.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("STOCK-REPORT-JSON File Generated");
		} else {
			System.out.println("STOCK-REPORT not Generated");
		}
	}

}
