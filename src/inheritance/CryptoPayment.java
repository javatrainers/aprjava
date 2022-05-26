package inheritance;

// inherited 1 complete methods
// and 1 incomplete method
// from AbPayment parent
//concrete = 100% complete
public class CryptoPayment extends ABPayment{
	public void processPayment() {
		System.out.println("process crypto");
	}
}
