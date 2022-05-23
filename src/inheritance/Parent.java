package inheritance;

public class Parent extends GrandParent {
	int x=20;
	public int add(int a, int b) {
		return a+b;
	}
	// if super() is missing
	// compiler will add it as the first line
	public Parent() {
		super();// parent's parent constcutor
		System.out.println("constructing parent");
	}
	
	public void greet() {
		System.out.println("hi");
	}
	
	
}
