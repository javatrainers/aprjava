package String;

public class StringTest {

	public static void main(String[] args) {
		
		String firstName="john";
		String lastName="doe";
		System.out.println("welcome mr :"+   firstName.concat(lastName)); // john10
		
		String email="java@gmail.com";
		if(email.contains("@") == false || email.endsWith(".com") == false
				|| email.indexOf("@") == 0
				)
			System.out.println("please enter valid email id");
		else
			System.out.println("valid email id");
		// == should be used only for primitive data type
		String a="john";  // a : #abc , inside the pool
		String b=new String("john");// b : #xyz, outside the pool 
		String c="john"; // c : #abc , inside the pool
		if( a .equals(b) )
			System.out.println( "they are same" );
		else
			System.out.println( "they are different" );
		
		String x="jane doe";
		System.out.println( x.replaceAll("jan", "feb"));// febe doe
		String phone="(123)456 - 7890";
		// 123 456 7890,1234567890, 123-456-7890, (123)456-7890
		phone=phone.replaceAll(" ", "");//(123)456-7890
		phone=phone.replaceAll("-", "");//(123)4567890
		phone=phone.replaceAll("(", "");//123)4567890
		phone=phone.replaceAll(")", "");//1234567890
		
		String fullName="john doe";
		String[] nameArr=fullName.split("o");
		// split fullname value into group(array) of smaller string
		//
		
		// equalIgnoreCase method = example - 
		//					comparing login userid and registered userid
		// equals method= comparing login pwd and registerd pwd
		//					Captial letter, lower letter, number, special character
		
		
		b=b.intern();// go to string pool, look for john and set the new 
		// string pool address for b variable

		
	}

}
