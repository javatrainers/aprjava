package exception;

public class NPEExceptionTest {
	static Person p1;
	static Person p2=new Person();
	
	public static void main(String[] args) {
		School s=new School();
		System.out.println(s.student.addr.city);
	}

}
