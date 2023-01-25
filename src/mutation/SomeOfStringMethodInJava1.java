package mutation;

public class SomeOfStringMethodInJava1 {

	public static void main(String[] args) {

		//There are dozens of methods that are coming with Java Class,
		//but there are some of the important ones that we need to know
		String name = "Thomas";
		//lenght();
		System.out.println(name.length());
		//character at a specific index
		System.out.println(name.charAt(2));
		//index of a character in a String
		System.out.println(name.indexOf('T'));
		//we can get a subString of a String
		System.out.println(name.substring(1));
		System.out.println(name.substring(1, 3));
		//change characteres of a String to LowwerCase
		System.out.println(name.toLowerCase());
		//change characters of a String to UpperCase
		System.out.println(name.toUpperCase());
		//startsWith => will return a boolean either true or false
		System.out.println(name.startsWith("J"));
		//endsWith => will return a boolean either true or false
		System.out.println(name.endsWith("u"));
		//contains();
		System.out.println(name.contains("u"));
		//replace();
		String fullName = "Philip Colunga";
		System.out.println(fullName.replace('i', 'u'));
		System.out.println(fullName.replace("Philip", "David"));
		String text = "Philip David Salary is $5000 after %12 tax";
		System.out.println(text.replaceAll("[1-90$%]", "*"));
		//trim();
		String name1 = "  Emma";
		System.out.println(name1);
		System.out.println(name1.trim());
		//equals => the lower and upper case letter matter
		String name2 = "CARMEN";
		String name3 = "Carmen";
		System.out.println("equals: " + name2.equals(name3));
		//equalIgnoreCase => lower and upper case letter does not matter
		String city1 = "Tysons Corner";
		String city2 = "TYSONS CORNER";
		System.out.println(city1.equalsIgnoreCase(city2));
		//content
		String state1 = "Virginia";
		String state2 = "Virginia";
		System.out.println(state1.contentEquals(state2));


	}

}


