package controlFlow;

import java.util.Scanner;

public class ControlFlowTest {
	static int balance = 10000;
	static int regPin=1234;
	public static void main(String[] args) {
		int enteredPin=1234;
		// if loop is based upon a boolean input
		// boolean value, boolean variable, operator that has
		// boolean output
		// always substitue value to variables mentioned
		// in control flow
		if( regPin==enteredPin)
		//	if( 1234==1234) // if (true)
			System.out.println("welcome to java bank");
		else
			System.out.println("invalid pin");
		
		boolean x=true; // statements.
		// declaration int a;
		// inititlation int a=10;
		// assignement a=20;
		// add(10,20);
		if(x) // if(true)	
			System.out.println("hi");
		
		if(false)
			System.out.println("bye");
		
		
		int withdrawAmount=12000;
		//if(10000 >= 6000) , if(true)
		if(balance >= withdrawAmount) {
			// balance=10000-6000; // balance=4000
			balance=balance-withdrawAmount;
			System.out.println("collect your cash");
			System.out.println("your new balance is :"+balance);
		}
		else {
			System.out.println("insufficient fund in your account");
			System.out.println("please enter amount below :"+balance);
		}
		
		
		int option=2;

		if(option==1)
			;// empty block
		else if(option==2){
			System.out.println("enter amount to deposit");
		}
		else if(option==3){
			System.out.println("your balance is 1000");
		}
		else{ // default block
			System.out.println("invalid option");
		}
		
		System.out.println("bye bye");
		
		
		if(false);
			System.out.println("testing");
		
		if(false) {
			
		}
			// indepeendent line, not part of above if condition
			System.out.println("testing");
		
			for(   int i=0; i<4   ; i++ ){
				// print output
				System.out.println("hi");
				if(i==2)
					break;
				System.out.println("bye");
			}
		// sc will allow to take input from screen	
		Scanner sc=new Scanner(System.in);
		System.out.println("begin shopping");
		System.out.println("do you wish to add item to cart? enter true/false");
		// sc = scanner is a program that will allow to take input from screen
		// nextBoolean= is a method in scanner program
		// 				that allows to take boolean input from screen
		//				boolean input customer entered will be then transfered
		//				to LHS boolean variable
		boolean choice=sc.nextBoolean();  
		while( choice ) {
			System.out.println("added item to cart");
			System.out.println("do you wish to add another item to cart? enter true/false");
			choice=sc.nextBoolean();  
		}
		
		
		System.out.println("welcome to java bank");
		do {
			System.out.println("enter 1 for deposit, 2 for withdraw, 3 for balance");
			// nextInt = is a method in scanner program
			// 				that allows to take int input from screen
			//				int input customer entered will be then transfered
			//				to LHS int variable
			int atmOption=sc.nextInt();
			if(atmOption==1)
				System.out.println("withdraw complete");
			else if(atmOption==2)
				System.out.println("deposit complete");
			else if (atmOption==3)
				System.out.println("acct balance is 1000");
			
			System.out.println("do you wish to perform another transaction, enter true/false");
			choice=sc.nextBoolean();
		}while(choice);
	}

}
