package threads;

public class MainProgram {
// sequential
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main entered");
		
		ProgramA pa = new ProgramA();
		pa.start();// method call,
		pa.setPriority(Thread.MAX_PRIORITY);
		// start method = instructs to run
		// the code in public void run()
		// parallely , beside other programs
		// transfer control to target method
		
		ProgramB pb = new ProgramB();
		Thread t=new Thread(pb);
		t.start();
		
		ProgramC pc = new ProgramC();
		pc.start();

		
		//pa.join();// indefinite waiting
		pa.join(6000);// timed waiting
		pa.stop();
		// main program will wait for 3 seconds
		// if programA ends before 3 second, main will also end
		// if programA does not end within 3 second, mail will still end
		System.out.println("main ended");
		
		
	}

}
