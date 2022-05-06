package references;

public class Factory {

	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product();
		p2.name="iphone";
		Product p3=new Product();
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		System.out.println(p1.quantity);
		System.out.println(p3.price);
		// RHS options ???
		p1.name="samsung"; // direct value of string
		// string = product
		p1.name=p2.price; // any variable that is string
		p1.name=p3.name;
		p1.name=p1.name;
		
		// String = Product
		//p1.name=p2;
		// int=int
		p1.quantity=p2.price;
		// what is the data type of variable p2
		// find out where it is declared
		// first line where that variable was used
		// word before variable... data type
		
		// what is data type of p1.name
		// identity data type of p1
		// go to product program
		
	}

}
