package variableAndMethod;

public class ValueTransfers {

	public static void main(String[] args) {
	/*	
		1) LHS & RHS data type should match
		2) LHS can be variable only
		RHS can be value or a variable
			if RHS is a variable
			.. substitute RHS variable to its value
	*/// executing lines
		int a=30;
		int b=40;
		int c=20;
		String d="john";
		String e="jane";
		a=b;//a=40
		b=c;
		b=50;
		c=a;// c= latest value of a, c=40.
		e=d;// e= latest value of d, e="john"
		d="mike";
		//a=d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
