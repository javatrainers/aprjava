package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.*;
import java.util.Set;

public class HashSample {

	public  static void main(String args[])
	{
		// in-built data type (Library)
		String a;
		// user-defined data type 
		Student s;
		
		TreeSet<Student> school=new TreeSet<Student>(); 
		Student s1=new Student("john doe",1);
		Student s2=new Student("jane doe",2);
		Student s3=new Student("john doe",1);
		school.add( s1 );
		school.add( s2 );
		school.add( s3 );
		
		System.out.println(school.size());
		System.out.println( school );
		/*
		
		// collection only work with Objects, NO primitive data type
		// wrapper class = Object version of primitive data type
		// int = Integer, float = Float, byte = Byte, short=Short,
		// long=Long , double= Double, boolean= Boolean,
		// char=Character
		ArrayList<Integer> scores=new ArrayList<Integer>();
		scores.add(10);
		scores.add(2);
		scores.add(16);
		scores.add(13);
		
		
		// map will store pair = Key and Value
		HashMap<String, Integer> studentPercent =
				new HashMap<String, Integer>();
		studentPercent.put("john",35 );
		studentPercent.put("jane",75 );
		studentPercent.put("mike",65 );
		System.out.println( studentPercent.size() );
		
		
		
		System.out.println("\n \n \n");
		//LinkedHashMap<String, String> studentPercent =new LinkedHashMap<String, String>();
		//HashMap<String, String> studentPercent =new HashMap<String, String>();
		//TreeMap<String, String> studentPercent =new TreeMap<String, String>();
		int[] arr=new int[5];
		// wrapper classes... Object version of primitive data type.
		Hashtable<String, Integer> studentPercent =new Hashtable<String, Integer>();
		studentPercent.put("ram", 65);
		studentPercent.put("shyam", 23);
		studentPercent.put("bharat", 55);
		studentPercent.put("shyam", 45);
		
		int shyamValue=studentPercent.get("shyam");
		// get size of hash
		int studentSize=studentPercent.size();
		System.out.println("hash : number of students :"+studentSize);
		
		// remove an items from hash by key
		studentPercent.remove("bharat");
		studentSize=studentPercent.size();
		System.out.println("after removing bharat. hash : number of students :"+studentSize);
		
		// get value by key
		int percent=studentPercent.get("ram");
		
		// check if key exists 
		if(studentPercent.containsKey("ram"))
		{
			System.out.println("student ram exists");
		}

		// check if value exists 
		if(studentPercent.contains("65"))
		{
			System.out.println("student scored 65");
		}
		
		// get all the keys from hashmap 
		Set<String> studentNameKey=studentPercent.keySet();
		{
			System.out.println("student scored 65");
		}
	
	for(String s:studentNameKey)
	{
		System.out.println("Key is:"+s);
		System.out.println("Value is:"+studentPercent.get(s));
	}
*/		
	}
}
