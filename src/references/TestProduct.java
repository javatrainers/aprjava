package references;

public class TestProduct {

	public static void main(String[] args) {
		Product p1=new Product();	
		Product p2=new Product();	
		
		p2.name="iphone";	
		p1.name="moto";	
		p2.name="samsung";	
		p2=p1;	
		p1=new Product();	
		
		
		System.out.println(p1.name);	
		System.out.println(p2.name);	
		// LHS = product
		// RHS = product
		//p1=p2;
		// LHS = product
		// RHS = String
		//p2=p1.name;
		// LHS = String
		// RHS = product
		//p2.name=p1;
		
	}

}
