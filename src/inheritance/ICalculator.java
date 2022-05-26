package inheritance;
// abstract = INCOMPLETE program
public interface ICalculator {
	int a=10; // CONSTANT/FIXED/FINAL.. cannot change value
	
	public int add(int a, int b);
	public int sub(int a, int b);
	public int mul(int a, int b);
	public int div(int a, int b);
	default int calSquare(int side) {
		return side * side;
	}
}
