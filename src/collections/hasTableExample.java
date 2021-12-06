package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasTableExample {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
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
