package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
	//  Iphone3 i3=new IphoneX();
		Parent p=new Child();
		System.out.println(p.x);
		//System.out.println(p.y);
		p.add(1,6);
		p.sub(12,3);
		// p has access to y and sub method
		// but hidden
		// typecasting - unlock hidden variable and methods
		if(p instanceof Child)
			((Child)p).sub(12,3);
		
		/*
		Parent p=new Parent();
		int sum1=p.add(10, 20);
		Child chi=new Child();
		System.out.println(chi.x);
		System.out.println(chi.y);
		System.out.println(chi.z);
		int sum2=chi.add(10, 20);
		int sub=chi.sub(10, 20);
		int mul=chi.mul(10, 20);
		*/
	}

}
