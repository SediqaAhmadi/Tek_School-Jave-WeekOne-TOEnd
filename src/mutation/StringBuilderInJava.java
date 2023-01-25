package mutation;

public class StringBuilderInJava {

	public static void main(String[] args) {
		//StringBuilder is mutable
		//that means if we are creating a string using StringBuilder, we can change the value
		//everytime we change the value, a new object will not be created in the heap, but
		//the value for the same object will be changes, that is why we say StringBuilder is mutable
		
		//with this method, now the size and capacity of our StringBuilder is 4
		//if we want to apend new string with current value, Java will increase the capacity
		StringBuilder sb1 = new StringBuilder("Java");
		//with this method, the size is 0, but the capacity is 16
		//if we want to create a string and the size is more than 16, Java will increase the capacity
		StringBuilder sb2 = new StringBuilder();
		//with this method, the size and capacity is going to be 4
		//if we want to apend new string with current value, Java will increase the capacity
		StringBuilder sb3 = new StringBuilder(4);
		
		StringBuilder sbName = new StringBuilder("Emma");
		sbName.append(" Chen");
		sbName.append(" Age = 30");
		System.out.println(sbName); //?
		//We created on object and changed it's value two times,
		//that means we didn't create 3 different String objects in String pool
		//but only one string object in the heap and we just changed it's value
		//the downside is, we no longer have access to string object with value = Emma only
		
		//but if we look at a String example
		String strName = "Emma";
		strName.concat(" Chen");
		System.out.println(strName); //?
		
		//how we can print the full name?
		//first we have to store the full name (strName + "Chen") in anther string
		String fullName = strName.concat(" Chen");
		System.out.println(fullName);
		System.out.println(strName);
		

	}

}

