package inheritance;

public class Iphone {
	// private > default > protected > public
	void camera() {
		System.out.println("take pictures");
	} 
// overloading = compile-time poly

	public void text(int i) {
		System.out.println("send numbers");
	}

	public void text(String s) {
		System.out.println("send text");
	}

}
