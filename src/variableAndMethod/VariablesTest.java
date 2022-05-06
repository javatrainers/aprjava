package variableAndMethod;

// this is the begingin of program
// program is called variabletest
// name follow camelcase format
// { indicates the begining of ptoram
public class VariablesTest {

	public static void main(String[] args) {
		/*
		LHS ( left hand side of equal sign)  int a
		RHS ( right hand side of equal sign) 10
		
		LHS should always be a variable
		RHS can be a value or another matching(similar data type)
		 variable
		*/
		int a=10; // LHS is variable.. RHS is value
		int b=20;
		String c="john";
	//	a=c; error because c is of type String and a is int
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// when we have variable on RHS
		// value of RHS variable gets transfered to LHS variable
		a=b; 
			// value of RHS variable... value of b is 20
			// value 20 gets transferd to a variable
		// a=b changes into a=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
		
	}

}
