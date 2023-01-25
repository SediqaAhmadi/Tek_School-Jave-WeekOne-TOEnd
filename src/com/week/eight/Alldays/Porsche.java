package com.week.eight.Alldays;

import java.util.Arrays;

public class Porsche extends VW{
		
		String [] porscheModels;
		
		public Porsche(String dealershipName, String address) {
			super(dealershipName, address);
			this.porscheModels = new String[3];
			porscheModels[0] = "Prosche Z1";
			porscheModels[1] = "Porsche Z2";
			porscheModels[2] = "Porsche Z3";
		}
		
		public String printAllPorscheModel() {
			return "List of Porsche Models available at " + super.getDealershiName() + " dealership " + Arrays.toString(porscheModels)
			+ "\nAddress = " + super.getAddress() + "\n" 
			+ "List of VW Models available at " + super.getDealershiName() + " dealership " + Arrays.toString(vwModels)
			+ "\nAddress = " + super.getAddress();
		}

	}