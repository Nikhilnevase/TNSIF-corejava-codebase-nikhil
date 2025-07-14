package lists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListDemo {
	
	public static void main(String[] args) {
		
		//Generic 
		
		List <Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		System.out.println(li);
		li.addLast(60);
		li.addFirst(00);
		System.out.println(li);
		
		
		
		ListIterator<Integer>	l1 = li.listIterator();
		while (l1.hasNext()) {
			
			System.out.println(l1.next());
		}
		
		
	}

}
