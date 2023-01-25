package com.week.eleven.review02;

public class LoopingWithForLoop {
		
		public static void main(String[] args) {
			
			//Count 1 to 10; 
			
//			for(int counter = 1 ; counter <=10 ; counter ++ ) {
//				System.out.println(counter);
//			}
			
			//counter from 10 to 1; 
			
//			for (int counter = 10; counter >= 1 ; counter --) {
//				System.out.println(counter);
//			}
			
			//loop some code for 1 minute but wait for 2 second at each loop. 
			
			for (int timer = 1; timer <= 60; timer += 2) {
				
				//do some logic. 
				System.out.println(timer);
				
				
				//wait for 2 second.
				try {
					
				Thread.sleep(2000);
				
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
		}

	}
