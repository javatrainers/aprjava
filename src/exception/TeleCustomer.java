package exception;

import java.util.Scanner;

public class TeleCustomer {
	public static void main(String[] args) {
		Telecom t=new Telecom();
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter phone to call");
			long l=sc.nextLong();
			t.call(l);
		} catch (InvalidPhoneException e) {
			e.printStackTrace();
		}
	}

}
