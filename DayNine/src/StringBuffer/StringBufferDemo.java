package StringBuffer;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		 
		StringBuffer buffer = new StringBuffer("Nikhil");
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		System.out.println(buffer.length());
		String s;
		int a = 4;
		buffer = new StringBuffer(40);
		s=buffer.append("a=").append(a).append("!").toString();
		
		System.out.println(buffer);
		
		buffer = new StringBuffer("I Java");
		buffer.insert(1, "like");
		System.out.println(buffer);
		
		System.out.println(buffer.delete(1,4));
		System.out.println(buffer);
		
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
	}

}
