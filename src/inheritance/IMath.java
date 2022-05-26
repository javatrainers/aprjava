package inheritance;

public interface IMath {
	public int add(int a, int b);
	public int areaOfCirlce(int radius);
	default int calSquare(int side) {
		int area=side * side;
		return area;
	}
}
