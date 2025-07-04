package Relation;

public class Executor {
public static void main(String []args) {
	
	Address address = new Address("401", "pune", "MAHA", "1001");
	
	Person p = new Person("nikhil",address);
	  p.DisplayInfo();		
	  
	  System.out.print(p);
	}


}
