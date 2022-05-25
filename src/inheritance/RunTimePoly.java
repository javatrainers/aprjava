package inheritance;

import java.util.Scanner;

public class RunTimePoly {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter 1 for basic, 5 for Iphone5 , 10 for IphoneX, 13 for Iphone13");
		int option=sc.nextInt();
		Iphone i=new Iphone();
		Iphone5 i5=new Iphone5();
		IphoneX iX=new IphoneX();
		Iphone13 i13=new Iphone13();
		if(option == 1)
			photoShoot(i);
		else if(option == 5)
			photoShoot(i5);
		else if(option == 10)
			photoShoot(iX);
		else if(option == 13)
			photoShoot(i13);
		
	}
	// many forms
	// same functionality 
	// done in many ways
	// polymorphism runtime
	public static void photoShoot(Iphone i) {
		i.camera();
		// in runtime based upon what type
		// of variable is passed
		// the method from that program
		// will be called
	}
}
