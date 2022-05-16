package operators;

import variableAndMethod.Person;

public class OperatorTest { // class block

	public static void main(String[] args) {// method block
		
		int a=10;
		int b=20;
		//arithemtic operator 
		// used on = numeric data types (LHS and RHS)
		// result is also numeric value
		System.out.println(  a + b );
		System.out.println(  a - b );
		System.out.println(  a * b );
		System.out.println(  b / a );
		System.out.println(  23 % 10 ); // modulous operator.
		
		// equality operator
		// used on = can be used on every data type
		//			(recommendtaion - use it only simple/primitive data type)
		// result = boolean
		// rules = LHS and RHS should be same data type
		// a and b are ssimple or primitiv data type "int"
		System.out.println( a==b );
		Person p1=new Person();
		Person p2=new Person();
		p1.name="john";
		p2.name="john";
		// u can use it for complex/object data type
		System.out.println( p1==p2 );
		
		int p=20;
		int q=30;
		// Is p NOT EQUAL to q = true
		// Is 20 NOT EQUAL to 30 = true
		System.out.println(  p!=q );
		int r=20;
		int s=20;
		// Is r NOT EQUAL to s= false
		// Is 20 NOT EQUAL to 20= false
		System.out.println(  r!=s ); //false
		
		// Relational operator ( greater, less comprison)
		// used = for numeric data type
		// result = boolean
		int t=30;
		int u=25;
		// Is t greater than u = true
		// Is 30 greater than 25 = true
		System.out.println( t > u);
		// Is t lesser than u = false
		// Is 30 lesser than 25 = false
		System.out.println( t < u);
		int v=20;
		int w=20;
		// Either v is greater or equal to w
		// Either 20 is greater or equal to 20 = true
		System.out.println( v >= w );
		// Either v is lesser or equal to w
		// Either 20 is lesser or equal to 20 = true
		System.out.println( v <= w );
		
		
		
		// unary operator.. 
		// used primarily for number operator
		// result is numeric
		int c=-20;
		// -c
		// minus of minus 20 = plus 20
		// - + - - 
		System.out.println(  -(+(-c)) );
		
		// increment/decrement operator
		int d=10;
		d++; // increment by 1.. d changs to 11
		d--; // decrement by 1.. d changs to 10
		d--;
		System.out.println(d);
		
		++d; // pre-increment ( increment on before line)
		d++; // post-increment ( increment on after line)
		System.out.println("********");
		int e=10;
		System.out.println(  e++  );// print 10. 
		// e=11 =  post increment = on next line
		// e=12
		System.out.println(  ++e ); // print 12
		System.out.println(  e++ ); // print 12
		// e=13 // part of line 91 post increment
		// e=14 // part of line 94 pre increment
		System.out.println(  ++e ); // print 14
		
		int f=10;
		// value tracker.. f=9
		System.out.println( --f); // print 9 
		
		// value tracker..f=10
		System.out.println( ++f); // print 10
		// 

		System.out.println( f++); // print 10
		// value tracker..f=11
		
		System.out.println( f++); // print 11
		// value tracker..f=12
		
		
		for(int k=10;k<10;k++)
		{
			
		}
		// nested block
		{
			{// local blocks
				
			}
		}
		 
	}

}
