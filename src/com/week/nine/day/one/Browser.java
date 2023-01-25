package com.week.nine.day.one;

public interface Browser {

	//Only method signatures allowed in interfaces. 
		public void openBrowser();
		
		public void closeBrowser(); 
		
		public void navigate();
		
		public void waitForBrowser(long milisecond);

		public String getName();
	}

