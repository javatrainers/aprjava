package inheritance;
// multiple inheritnace not allowed to avoid ambiguiity/confusion
// when there is conflicting methods in both parents
public class Child extends Parent{
	// default constructor for child class looks like
	public Child() {
		super(); // parent constructor call
		// child can do anything , only after
		// parent is constructed first
		int a=10;
		System.out.println("child taking first step");
		
		
	}

int y=20;	
	public int sub(int a, int b) {
		return a-b;
	}
	
}
