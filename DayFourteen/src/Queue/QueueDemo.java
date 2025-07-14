package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		Queue<Integer> r =new LinkedList<Integer>();
		
		r.add(6);
		r.add(10);
		r.add(12);
		r.add(15);
		r.add(2);
		
		System.out.println(r);
		int positionpeek =r.peek();
		System.out.println("using peek method First position element " + positionpeek);
		
		int positionalelement= r.element();
		
		System.out.println("using element method :"+ positionalelement);
		
		System.out.println();
		
		System.out.println(r.retainAll(r));
		System.out.println(r.hashCode());
		
		  Iterator<Integer> itr =r.iterator();
		  
		  while(itr.hasNext()){
			  
		  System.out.println(itr.next());
		}
	}
}
