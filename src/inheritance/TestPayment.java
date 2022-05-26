package inheritance;

public class TestPayment {

	public static void main(String[] args) {
		// RHS can be same or 
		// sub/child data type
		// that is CONCRETE
		IPayment ip=new CreditPayment();
		ABPayment ap=new CryptoPayment();
		CryptoPayment cp=new CryptoPayment();
	}

}
