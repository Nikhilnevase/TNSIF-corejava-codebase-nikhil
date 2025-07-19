package sets;

import java.util.HashMap;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		
		hm.put(101, 23.667);
		hm.put(102, "nikhil");
		hm.put(1001, 94);
		hm.put(101, 90.774);
		
		System.out.println(hm);
	}

}
