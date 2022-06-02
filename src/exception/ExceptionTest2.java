package exception;

import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Test t=new Test();
		try {
			t.method1();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		System.out.println("welcome");
		try {
			String s="john";
			int[] ar=new int[4]; // 0,1,2,3
			System.out.println( ar[2] );// index outside range
			// failure related to array index
			int x=100/0;		
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("do not divide number by zero");
		}
		catch(ArrayIndexOutOfBoundsException aa) {
			aa.printStackTrace();
			System.out.println(" array index must be size - 1");
		}
		finally {
			System.out.println("thank you");
		}
		System.out.println("****************");
		
		
		
		/*
		System.out.println("hi");
		int i=100/0; // abruptly terminated program
		System.out.println("bye");
		*/
		System.out.println("hi");
		try {// works = if no failure
			// suspect code might have problem
			System.out.println("1");
			int i=100/0;
		}
		// works = when failure
		catch(Exception e) {
			// action to be taken in the event of failure
			System.out.println("please do not divide by zero");
		}
		finally { // GUARANTEED block
			// works = in success as well as failure 
			System.out.println("thank you for using math software"); 
		}
		
		// gracefull shutdown
		System.out.println("bye");
		
	}

}
