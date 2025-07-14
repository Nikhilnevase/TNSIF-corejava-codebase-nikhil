package lists;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class vector {
	
	public static void main(String[] args) {
		
		List <Integer> v= new Vector<Integer>();	
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		System.out.println(v);
		
		System.out.println();
		System.out.println(v.getFirst());
		System.out.println(v.size());
		
		//traverse 
		Iterator<Integer> v1=v.iterator();
		
		while(v1.hasNext()) {
			
			System.out.println(v1.next());
		}
		
		
	}

}
