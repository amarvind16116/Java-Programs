package com.bridgelabz.oops.jSON_Inventry.stockManagement;

/*************************************************************************************
 * @author   Arvind kumar
 * @Version  1.0
 * @purpose  program have GETTER SETTER method of company which have shares and company
 * @date     19-11-19
 *************************************************************************************/


public class StockManagementBean {
	private String stockName;
	private String stockShares;
	private double sharePrice;
	private double persharePrice;
	
	public double getPersharePrice() {
		return persharePrice;
	}
	public void setPersharePrice(double d) {
		this.persharePrice = d;
	}
	public String getStockName() {
		return stockName;
	}
	public String setStockName(String stockName) {
		return this.stockName = stockName;
	}
	public String getStockShares() {
		return stockShares;
	}
	public String setStockShares(String string) {
		return this.stockShares = string;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public double setSharePrice(double sharePrice) {
		return this.sharePrice = sharePrice;
	}
}
