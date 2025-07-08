package String;

public class StringOperations {
	
	public static void main(String[] args) {
		 
		String s1 = new String ("india");
		
		System.out.println(s1);
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		System.out.println(s1.trim());
		System.out.println(s1.stripTrailing());
		
		s2 = new String (s1);
		System.out.println("case 1: " + s1.equals(s2));
		System.err.println("case 2 :" + s1==s2);
	}

}
