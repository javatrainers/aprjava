package methods;

import variableAndMethod.Person;
// server program = provides calculator service
public class Calculator {
	
	public int testAdd(int x,int y,Person p) {
		int sum=x+y;
		return sum;
	}
	
	// callee
	public int add(int num1,int num2,String c) {
		return num1+num2;
	}
	// local caller
	public void test() {
		// local method call
	//	add(10,20);
	}
	
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	public int mul(int num1,int num2) {
		return num1*num2;
	}
	public int div(int num1,int num2) {
		return num1/num2;
	}
	
	// method declaration
	/*
	 	programmer for multiply requires 2 numbers as input
	 	programmer has promised that he/she will return a long output
	 */
	public long multiply( int number1, int number2)  {
		// WHY return statement = declaration line we promised an output
		// WHAT type of return statement = it should match declaration line output
		return 123;// programmer promised they will return an output of numbered value(long)
	}
	public	int	calculateCircle (int radius) {
		return 0;
	}
	boolean	login(String userid, String password) {
		return true;
	}
	public void greet(String message) {
		
	}
	public void hello(String x) {
		
	}
	public int bye(   ) {
		return 1;
	}
	
	// get nearest gas station address
	// name = getNearestGasStation
	// input = NONE
	// output = complex output... street(String), 
	// 			buikding(String), state(String), city(String), zip(int)
	// public output name(input)
	// output is complex= user defined data type
	public GasAddress getNearestGasStation( ){
		return null;
	}
	
	String name; // string object or "reference" data type
	int a; // primitive or simple data type
	
	
/* RULES for return statement
if the output/return type is primitive(purple highlighted) or simple
	any variable of same type or any value of same data type can be returned
if the output/return type is complex/object/reference data type
	any variable of same type or null value can be returned.
*/	
	// output of the method = return type
	// method declaration = agreement between this program and the customer
	// divide = i will prvide division service
	// i required 2 int inputs from the customer
	// i will return a int numbers result back to you
	
	int x=10;
	String aa="12";
	Accountant acc=new Accountant();
	public int divide(int number1,int number2) {
		int z=20;
		boolean bb=true;
		float ff=1.1f;
		// return 1; // 1 is value of data type int(numbered data type)
		return z; // z is variable of same data type as return type
	}
	// return type= complex/object/reference data type
	public Accountant fileTaxes() {
		// return null;
		return acc;
	}
	
}
