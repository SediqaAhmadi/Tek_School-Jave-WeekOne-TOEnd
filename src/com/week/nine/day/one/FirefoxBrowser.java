package com.week.nine.day.one;

public class FirefoxBrowser implements Browser {

	
	@Override
	public void openBrowser() {
		System.out.println("Opening Firefox Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing Firefox Browser");
		
	}

	@Override
	public void navigate() {
		System.out.println("navigating with Firefox Browser");
		
	}

	@Override
	public void waitForBrowser(long milisecond) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}


