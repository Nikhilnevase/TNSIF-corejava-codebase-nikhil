package Staticmethod;

public class MyclassDemo {
	
	public static void main(String []args) {
		Myclass.display();
		Myclass o1 =new Myclass();
		System.out.print(o1);
		
		Myclass.display();
		
		Myclass o2 = new Myclass ();
		System.out.println(o2);
	}

}
