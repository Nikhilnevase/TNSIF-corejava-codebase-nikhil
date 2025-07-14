package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
	
	public static void main(String[] args) {
		
		Deque<String> deque1 = new ArrayDeque<String>();
		
		deque1.add("tns");
		deque1.add("nikhil");
		deque1.add("Nevase");
		deque1.add("Prathamesh");
		deque1.add("Amar");
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		//Traverse without iterator
		for (String  str: deque1) {
			
			System.out.println("Deque1 data " + str);
			
			
		}
			System.out.println(deque1);
			
		}
	}


