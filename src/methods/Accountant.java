package methods;

import variableAndMethod.Person;

// client/customer program
// consumes service
public class Accountant {
// client & server program
// communicate through
// method/service calls

	// outsider caller
	public static void main(String[] args) {
		// 1) create reference or connection to the program that contains add service/method
			Calculator cal=new Calculator(); // reference variable cal
		// 2) using reference variable for the other program
		//	and with dot operator.. access the method(make a method call)
			int x=10; int y=20; String z="jane";
			
			// passing direct value to callee program
			int result1=cal.add(12,23,"john");
			// passing variable of matching type to callee program
			int result2=cal.add(x,y,z);
			
		// rules on passing input to method 
		/*
		 	1) number of input should match - 3 input passed
		 	2) data type of input should match - 2 integers and 1 string
		 	3) order of input should match
		 */
		// rules on handling return type
		/*
		 	return type of callee program should match
		 	LHS variable in the caller program
		 */
		
		int a=10;
		int b=20;
		Person per=new Person();
		
		//					10,20, Person@6bf256fa
		int result=cal.testAdd(a,b,per);
		System.out.println("bye bye");
	}
}
