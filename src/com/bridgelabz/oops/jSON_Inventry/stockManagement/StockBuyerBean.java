package com.bridgelabz.oops.jSON_Inventry.stockManagement;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program have SETTER GETTER method for stock account those who
 * 			 buy the stocks
 * @date     19-11-19
 *************************************************************************************/


public class StockBuyerBean {
	private static String stockBuyerReport;
	
	private static	String firstName;
	private static String lastName;
	private static String companyName;
	private static int totalBoughtShare;
	private static int totalPrice;
	
	
	
	public static String getStockBuyerReport() {
		return stockBuyerReport;
	}
	public static String setStockBuyerReport(String stockBuyerReport) {
		return StockBuyerBean.stockBuyerReport = stockBuyerReport;
	}
	
	public static String getFirstName() {
		return firstName;
	}
	public static String setFirstName(String firstName) {
		return StockBuyerBean.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static String setLastName(String lastName) {
		return StockBuyerBean.lastName = lastName;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static String setCompanyName(String companyName) {
		return StockBuyerBean.companyName = companyName;
	}
	public static int getTotalBoughtShare() {
		return totalBoughtShare;
	}
	public static int setTotalBoughtShare(int totalBoughtShare) {
		return StockBuyerBean.totalBoughtShare = totalBoughtShare;
	}
	public static int getTotalPrice() {
		return totalPrice;
	}
	public static int setTotalPrice(int totalPrice) {
		return StockBuyerBean.totalPrice = totalPrice;
	}
}
