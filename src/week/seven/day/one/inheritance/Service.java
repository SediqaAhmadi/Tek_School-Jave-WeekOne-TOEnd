package week.seven.day.one.inheritance;

public class Service {
	
public int getSum(int[] numbers) {
	
	int sum = 0; 
	
	for (int number : numbers) {
		sum += number;
	}
	
	return sum;
}

}