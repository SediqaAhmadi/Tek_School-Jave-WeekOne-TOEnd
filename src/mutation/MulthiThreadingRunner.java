package mutation;

import com.week.eight.Alldays.MulthiThreading;

public class MulthiThreadingRunner {

	public static void main(String[] args) {

		for(int i = 1; i <= 5; i++) {
			MulthiThreading obj = new MulthiThreading(i);
			obj.start();
		}


}}
