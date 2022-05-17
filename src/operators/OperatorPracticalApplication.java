package operators;

import java.util.Scanner;

public class OperatorPracticalApplication {

	public static void main(String[] args) {
		int phone=1231231231;
		int pin=1234;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your phone");
		int loginPhone=sc.nextInt();
		System.out.println("enter your pin");
		int loginpin=sc.nextInt();
		
		if(loginPhone != phone)
			System.out.println("phone didnt match");
		if(loginpin != pin)
			System.out.println("pin didnt match");
		if(loginPhone == phone && loginpin == pin)
			System.out.println("successfull login");
			
	}

}
