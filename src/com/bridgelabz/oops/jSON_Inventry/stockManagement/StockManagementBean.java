package com.bridgelabz.oops.jSON_Inventry.stockManagement;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program have GETTER SETTER method of company which have shares and company
 * @date     19-11-19
 *************************************************************************************/


public class StockManagementBean {
	private static String stockName;
	private static String stockShares;
	private static double sharePrice;
	private static double persharePrice;
	
	public static double getPersharePrice() {
		return persharePrice;
	}
	public static void setPersharePrice(double d) {
		StockManagementBean.persharePrice = d;
	}
	public static String getStockName() {
		return stockName;
	}
	public static String setStockName(String stockName) {
		return StockManagementBean.stockName = stockName;
	}
	public static String getStockShares() {
		return stockShares;
	}
	public static String setStockShares(String string) {
		return StockManagementBean.stockShares = string;
	}
	public static double getSharePrice() {
		return sharePrice;
	}
	public static double setSharePrice(double sharePrice) {
		return StockManagementBean.sharePrice = sharePrice;
	}
}
