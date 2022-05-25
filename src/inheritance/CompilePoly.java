package inheritance;

public class CompilePoly {

	public static void main(String[] args) {
		Iphone5 i=new Iphone5();
		// there are 2 text methods
		// conflict is resolved
		// in compile time
		i.text(10);
		i.text("asd");
		i.text(1.1f);
		// iphone5 has 3 overloaded methods
		// iphone has 2 overloaded methods
	}

}
