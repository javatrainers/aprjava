package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		String[] n=new String[5];
		n[0]="john";
		n[1]="jane";
		
		// good for editing - inserting and deleting
		LinkedList<String> namesL=new LinkedList<String> ();
		
		// synchronized- thread safe but slower
		Vector<String> namesV=new Vector<String> ();
		
		// no synchronied - faster
		ArrayList<String> names=new ArrayList<String> ();
		
		
		names.add("john");
		names.add("jane");
		names.add("mike");
		System.out.println(names);
		System.out.println(names.get(1));
		names.add(1,"andy");
		System.out.println(names);
		System.out.println(names.get(1));
	}

}
