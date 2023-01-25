package com.week.eight.Alldays;

import java.util.Arrays;

public class VW {
	
	String[] vwModels;
	private String dealershipName;
	private String address;
	
	public VW(String dealershiName, String address) {
		this.vwModels = new String[3];
		vwModels[0] = "VW X1";
		vwModels[1] = "VW X2";
		vwModels[2] = "VW X3";
		this.dealershipName = dealershiName;
		this.address = address;
	}
	public String getDealershiName() {
		return dealershipName;
	}
	public void setDealershipName(String dealershipName) {
		this.dealershipName = dealershipName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String printListOfVWModels() {
		return "List of VW Models available at " + this.getDealershiName() +" dealership "+ Arrays.toString(vwModels) + "\nAddress = " + this.getAddress();
	}


}
