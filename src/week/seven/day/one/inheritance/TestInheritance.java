package week.seven.day.one.inheritance;

import com.week.seven.day.one.ChildFour;
import com.week.seven.day.one.ChildOne;

public class TestInheritance {

public static void main(String[] args) {
		
		ChildFour childFourObject = new ChildFour();
		
		childFourObject.printHairColor();
		
		childFourObject.childFourMethod();
		
		ChildOne child = new ChildOne();
		
		child.parentMethod();
		child.printHairColor();
		
		
		//Declare Object of Parent
//		Parent parent = new Parent();
//		parent.parentMethod();
		
		

		
		
	}

}
