package mutation;

public class PracticeStringClassInJava1 {

public static void main(String[] args) {
		
		//let print from A - Z
		//the downside of String class in Java is that sometime we are creating too many
		//Strings which will slow our project
		//but, sometimes we need that, because if we are looking for a specific result
		//among many results that we can get from a scenarios, then it will be usefull
		String alpha = "";
		for(char i = 'A'; i <= 'Z'; i++) {
			String temp = alpha += i;
			System.out.println(temp);
		}
		//if you just want to print the final result after all iterations are completed
		//the you can print the value of alpha outside the loop
		System.out.println(alpha);
		
		String alpha2 = "";
		for(char i = 'A'; i <= 'Z'; i++) {
			String temp2 = alpha2 += i;
			if(temp2.equals("ABCDEF")) {
				System.out.println(temp2);
			}else {
				
			}
		}
		
		//what if we use the StringBuilder to print alpha letter A - Z
		StringBuilder sb1 = new StringBuilder();
		for(char i = 'A'; i <= 'Z'; i++) {
			System.out.println(sb1.append(i));
		}
		System.out.println(sb1);


	}
	
	
	
	
	
	

}
