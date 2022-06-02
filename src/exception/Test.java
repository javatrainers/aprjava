package exception;

import java.io.File;
import java.io.IOException;

public class Test {
	public void method1() throws IOException {
		method2();
	}

	public void method2() throws IOException {
			method3();
	}

	// throws = whoever is calling method3 have to
	// handle/prepare for this exception/failure
	public void method3() throws IOException {
		
	// RUNTIME EXCEPTION - need not prepare try/catch for failure	
		
		int i =100/0; // math failure
		
		String [] names=new String[3];
		System.out.println(names[5]);// array index failure

	// COMPILE TIME EXCEPTION - mandatory to prepare for failures
		
		File f=new File("H:/tutorial/testing.txt");
		
			f.createNewFile(); // invalid drive location failure
		
	}

}
