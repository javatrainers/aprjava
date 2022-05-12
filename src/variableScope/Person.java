package variableScope;

public class Person {
	// global scope = long term information
		// instance variables - specific to 1 instance or 1 person
		// more to this in access privilege chapter
		String name="john";
		int age;
		// class variable - shared by everyone of type Person
		static String speices="human";
	
	// local scope = short lived information
	// a,b,c are parametric/input variable
	public int add(int a, int b,int c) {
		System.out.println(name);
		// local variables
		int temp1=a+b;
		int temp2=temp1+c;
		System.out.println(a);
		System.out.println(temp1);
		return temp2;
	}
	
	public int sub(int p,int q,int r) {
		System.out.println(name);
		int subtemp1=p-q;
		int subtemp2=subtemp1-r;
		System.out.println( p );
		System.out.println(x);
		return subtemp2;
	}
	
	
	// RULES on global scope varaiables
	/*
	 	1) no duplicate names among global variable
	 	2) global variable get default values
	 	3) global and local variable can have duplicate names
	 */
	int cc=30;
	int dd;
	int ee=40;
	
	
	public void test2(int aa) {
		int bb=20;
		int ee=50;
		System.out.println( bb );// 20
		System.out.println( cc ); // global variable value 30
		System.out.println( dd ); // global variable default value 0
		System.out.println( ee ); // whenever there is conflict
				// between global and local variable name = local gets prefered
			// hence prints 50
		System.out.println( this.ee );// if need to access global variable
					// while in conflict with similar local variable
				// use the keyword "this"
			// this will point to global instance variable
	}
	
	
	
	// RULES on local scope variables
	/*
	 	1) same names for parametric and local variables not allowed(same method)
	 	2) same names for local variable not allowed within its range/scope
	 	3) local variable cannot be used for printing or any other purpose
	 		unless initialized
	 */
	int ll; // DEFAULT VALUES only avaialbe for global variable
	public void test() {
		int d; // no default values for local variable
		System.out.println( ll ); // sysout prints VALUE of a variable
		System.out.println( d );
	}
	
	// scope of parametric variable
	// from 1st line to last line in this method
	public void testLocal(int x) {
		System.out.println( z );
		// block within a block = nested block
		int x=20;
		{
			int z=30; // scope/range = 41 to 54
			System.out.println( z );
			{
				// local scope/range = 
				//	FROM : the line it was declared = 48
				// 	TILL : the end of variable's block =52
					// what is the block of variable = look at opening bracket before declaration line
					// click on opening block.. editor will highlight end of that block
				int e=10;// declaration line create variable
				{
					System.out.println( z  );
				}
			}
		}
		{
			int f=10; // range/scope = 65 to 69
			{
				int f=30;
			}
		}
		int f=40;
		System.out.println( z );
	}
// same names for local variable NOT allowed within its range/scope	
	
	
	
	
}
