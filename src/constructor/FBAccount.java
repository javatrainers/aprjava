package constructor;

public class FBAccount {
	String name="john";		
	int age=25;		
	String school="A B C School";	
	// polymorphism
	// perform same functionality
	// in many ways
	// overloaded constructor
	// FBAccount can be constructed
	// in many ways
	// constructor declaration
	
	// NO default constructor provided
	// because the programmer has already written
	// 3 custom constrcutor in the program
	public FBAccount(String name){	
		this.name=name;
	}	
	// NOT a constructor, its a method
	public void FBAccount(){	
	}	

	public FBAccount(String name,int a){	
		this.name=name;
		age=a;
	}
	
	public FBAccount(String name,int a, String s){	
		this.name=name;
		age=a;
		school=s;
	}
}
