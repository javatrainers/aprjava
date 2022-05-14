package references;
public class ReferencePerson {
	
	public void method2(Person p1) {
		p1.name="jane";
	}
	
	public void method1() {
		Person p=new Person();
		method2(p);
		System.out.println(p.name);
	}
	
	void bye(){
		
	}
	
	
}
