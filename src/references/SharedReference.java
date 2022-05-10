package references;

public class SharedReference {

	public static void main(String[] args) {
		BankAccount husband=new BankAccount();
		BankAccount wife=husband;
		wife.balance=wife.balance + 50;
		System.out.println( wife.balance);
		System.out.println( husband.balance);
		husband.balance=husband.balance-25;
		System.out.println( wife.balance);
		System.out.println( husband.balance);
		
		
	}

}
