package com.bridgelabz.oops.jSON_Inventry.stockManagement;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program have SETTER GETTER method for stock account those who
 * 			 buy the stocks
 * @date     19-11-19
 *************************************************************************************/


public class StockBuyerBean {
	private String stockBuyerReport;
	
	private	String firstName;
	private String lastName;
	private String companyName;
	private int totalBoughtShare;
	private int totalPrice;
	
	public String getStockBuyerReport() {
		return stockBuyerReport;
	}
	public String setStockBuyerReport(String stockBuyerReport) {
		return this.stockBuyerReport = stockBuyerReport;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String setFirstName(String firstName) {
		return this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String setLastName(String lastName) {
		return this.lastName = lastName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String setCompanyName(String companyName) {
		return this.companyName = companyName;
	}
	public int getTotalBoughtShare() {
		return totalBoughtShare;
	}
	public int setTotalBoughtShare(int totalBoughtShare) {
		return this.totalBoughtShare = totalBoughtShare;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public int setTotalPrice(int totalPrice) {
		return this.totalPrice = totalPrice;
	}
}
