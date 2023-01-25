package mutation;

public class StringClassInJava {

	public static void main(String[] args) {

		//mutation in Java
		//String vs StringBuilder vs StringBuffer
		//String => is immutable
		//that means once we create a String, we can not change it's value
		//the size and capacity of a String are always the same
		//String is a sequence of characters in Java
		String name = "Tekschool";
		String result = name.concat(" Classes");
		System.out.println(result);
		
		//String Concatenation => I  can use (+) operator to concatenate the two strings
		String city1 = "Alexandria";
		String city2 = "Arlington";
		System.out.println(city1 + ", " +city2);
		
		//concatenate String with two ints
		String str1 = "salary: ";
		int salary = 100;
		int bounes = 20;
		System.out.println(str1 + (salary + bounes));
		
		//StringBuilder and StringBuffer => are mutable
		

	}

}

