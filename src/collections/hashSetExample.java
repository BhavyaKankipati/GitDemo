package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet, TreeSet, LinkedHashSet implements set interface
		//Set interface does not accepts duplicate values
		//There is no guarantee elements store in sequential order, random order
		
		HashSet<String> hs =new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("Third");
		hs.add("first");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		hs.remove("second");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		
		

	}

}
