package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			// Code that MIGHT have problem
			
			
			
		}catch(Exception e) {
			// safety net
			// Code to take action in the event of failure
			
		}
		finally {
			// mandatory block
		}
		
		
		
		// 	EXCEPTON
		// software problem
	//	int x=100/0; // ArithmeticException
		int[] scores=new int[3]; // 0 , 1 , 2
		System.out.println( scores[6] ); // ArrayIndexOutOfBoundException
		
		
		//	ERROR
		// group of 3 billion numbers (int)
		// 3 billion numbers X int size 4 bytes
		// 12 billion bytes = 12 GB
		int[] numbers=new int[300000000]; // OutOfMemoryError
		for(int i=0; i<numbers.length;i++) {
			numbers[i]=1000000000;
		}
		
	}

}
