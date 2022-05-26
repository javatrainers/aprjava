package inheritance;
//concrete = 100% complete
public class CreditPayment extends ABPayment{
	public void processPayment() {
		System.out.println("process credit card");
	}
}