package constructor;

public class FBTest {

	public static void main(String[] args) {
		//					    Constructor call
								// constructor with int does not exist
		FBAccount customer1=new FBAccount( "jane");			
		FBAccount customer2=new FBAccount("mike",23);			
		FBAccount customer3=new FBAccount("andy",27,"PQR School");			
		//FBAccount customer4=new FBAccount( );			

		// constructor with no 
		//input does not exist
		Student s=new Student();
	}

}
