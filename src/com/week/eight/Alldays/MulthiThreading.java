package com.week.eight.Alldays;

public class MulthiThreading {

	private int threadNumber;
	public MulthiThreading(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " = This is coming from thread => " + threadNumber);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}