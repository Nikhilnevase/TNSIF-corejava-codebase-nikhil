package sets;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;



public class HashMapTable {
	
	public static void main(String[] args) {
		
		Hashtable <Integer,String> ht= new Hashtable<Integer,String>();
		
		ht.put(101,"nikhil");
		ht.put(102, "Prathanesh");
		ht.put(103, "Sahil");
		
		System.out.println(ht);
		
		 System.out.println(ht.get(101));
		 
		 ht.clone();
		 System.out.println(ht);
		 
		 Set s= ht.keySet();
		 
		 System.out.println(s);
		 
		 Collection c= ht.values();
		 
		 System.out.println(c);
	   
	
	}

}
