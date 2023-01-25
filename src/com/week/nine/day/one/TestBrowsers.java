package com.week.nine.day.one;

public class TestBrowsers {

public static void main(String[] args) {
		
		ChromeBrowser chrome = new ChromeBrowser();
		
		chrome.openBrowser();
		
		chrome.closeBrowser();
		
		chrome.navigate();
		
		FirefoxBrowser firefox = new FirefoxBrowser();
		
		firefox.openBrowser();
		firefox.closeBrowser();
		firefox.navigate();
		
		
	}

}
