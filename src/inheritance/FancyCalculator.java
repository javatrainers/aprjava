package inheritance;
// FancyCalculator  has taken responsibilit
// to complete/write logic for missing/incomplete
// methods in ICalcualtor interface
public class FancyCalculator 
implements ICalculator,IMath{
// CONCRETE = COMPLETE program
	
	public int calSquare(int s) {
		return s*s;
	}
	
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public int areaOfCirlce(int radius) {
		return (int)(Math.PI * radius * radius);
	}
	

}
