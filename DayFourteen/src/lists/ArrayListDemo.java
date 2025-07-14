package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List list = new ArrayList(4);
		
		list.add(10);
		list.add(20);
		list.add("nikhil");
		list.add(false);
		list.add(10);
		
		System.out.println("list" +list);
		
		System.out.println(list.isEmpty());
		System.out.println(list.contains(10));
		
		list.remove(false);

		System.out.println(list);
		
		list.remove(2);

		System.out.println(list);
		System.out.println(list.indexOf(20));
		System.out.println("---------------------------");
		
		
		
		//Generic 
		
		List<String> name= new ArrayList<String>(5);
		
		name.add("nikhil");
		name.add("nevase");
		name.add("Prathamesh");
		name.add("Amar");
		name.add("Aditya");
		
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
		
		//Traversal Data
		
		Iterator <String> i = name.iterator();
		
		while (i.hasNext()) {
			
			String nm = i.next();
			
			System.out.println(nm+" ");
			
		}
		
		
		System.out.println();
		System.out.println(name);
		
		// privious method
		
		ListIterator<String> i1 = name.listIterator(name.size());
		
		while (i1.hasPrevious()) {
			
			 String nm1 =i1.previous();	
			 
		System.out.println(nm1+ "  ");
		
		
		
		}
		
		
		
		
		
		
		
		}

}
