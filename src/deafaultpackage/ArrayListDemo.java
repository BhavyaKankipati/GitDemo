package deafaultpackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//add duplicate values
		//ArrayList, LinkedList, Vector implements List interface
		//Array has fixed size where as array list grow dynamically
		
		//ArrayList<Integer> al=new ArrayList<Integer>();
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Bhavya");
		a.add("sivani");
		a.add("sai");
		a.add("java");
		a.add("java");
		
		System.out.println(a);
		a.add(0,"start");
		System.out.println(a);
		a.remove(1);
		a.remove("java");
		System.out.println(a);
		System.out.println(a.get(2));
		
		//testing presence of keyword
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("sivani"));
		
		System.out.println(a.indexOf("sai"));
		
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
