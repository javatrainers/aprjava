package aprjava;

public class Welcome {
	// int data type is highlighted = primitive/simple data type
	// String data type is not highlighted = object/complex data type
	static int age;// default values is 0 for primitive numeric type
	static String name;// dfault value is null for object
	static FacebookCustomer fb; // default value is null for object
	// null = no value.. nothing...
	
	public static void main(String[] args) {
		// task of system out print.. is to print value of
		// variable mentioned within the brackets
		System.out.println(age);
		System.out.println(name);
		System.out.println(fb);
		age=26;
		System.out.println(age);
		
		// System,String - program/class (in-built library)
		// part of JDK installation
		// FacebookCustomer - User Defined program/class
		// String - In-built program/class
		System.out.println("welcome to java");
	}

}
