package controlFlow;

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
		
		boolean x=true;
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
		}else {
			System.out.println("insufficient fund in your account");
			System.out.println("please enter amount below :"+balance);
		}
	}

}
