package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		
		//hashMap is not thread safe and not synchronized HashTable is threadsafe and synchronized
		//Hashtable is thread safe that means once the process completed then only other program can access has table
		//HashMap is better for non threading applications 
		//HashTable should be used in multi-threading applications
		//HashMap allows one null key any number of null values
		//Hashtable does not allow null key and null values
		//HashMap uses Iterator to iterate values where asHashTable uses enumerator to iterate values
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"first");
		hm.put(2, "second");
		hm.put(3,"third");
		hm.put(4,"fourth");
		System.out.println(hm.get(2));
		System.out.println(hm.get(44));
		hm.remove(4);
		System.out.println(hm.get(4));
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		
		//create hashtable ---pass table set collections
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
