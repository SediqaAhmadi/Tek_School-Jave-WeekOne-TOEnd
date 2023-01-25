package com.week.eight.Alldays;

public class Runner {

	public static void main(String[] args) {

		VW obj1 = new VW("Arligton VA", "22 Parkway Dr, Arlington VA 33454");
		System.out.println(obj1.printListOfVWModels());
		System.out.println("\n=================================\n");
		Porsche obj2 = new Porsche("Porsche VA", "55 Court Cir, Alexandria VA 33434");
		System.out.println(obj2.printAllPorscheModel());
		
		//since Porsche is a sub-company of VW, what if Porsche also want to access list of VW models?
		//we are chaining constructor and porsche already have access to VW list of trimes
		//what if Porsche also want to be able to print the list of all VW trims?
		
	}

}