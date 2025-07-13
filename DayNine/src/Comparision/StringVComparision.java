package Comparision;

public class StringVComparision {

	public static void main(String[] args) {

		String s1 = "TNSIF";
		String s2 = "TNSIF";
		String s3 = new String ("TNSIF");
		String s4 = new String ("TNSIF");
		
		
		System.out.println(s1==s1);
		System.out.println(s1==s2);// == always compare on basis of memory location "pool memory"
		System.out.println(s1==s3);
		System.out.println(s3.equals(s4)); // equals()	always compare  content of location or objects	
		System.out.println(s2.equals(s1)); // objects are ALWAYS  store in Heap memory 
		System.out.println(s2.equals(s4));
		System.out.println(s3==s4);
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareToIgnoreCase(s3));
		
		
		
	}
}
