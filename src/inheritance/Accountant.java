package inheritance;

public class Accountant {
	// NEW LHS RHS rule
	ICalculator ic=new FancyCalculator();
	public boolean calTax(int ssn,int income) {
		int sum=ic.add(123, 1230);
		
		return true;
	}
}
