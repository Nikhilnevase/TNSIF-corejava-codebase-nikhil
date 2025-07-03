package tnsdayfour;
import java.util.*;
public class customerDemo {
	public static void main (String[]args) {
		customer cl1 = new customer();
		
		 
		
		  Scanner sc  = new Scanner (System.in);
		  System.out.print("Enter customer name");
		  String name = sc.next();
		  System.out.print("Enter customer  city");
		  String customer_city = sc.next();
		  System.out.print("Enter customer ID");
			int customerId = sc.nextInt();
			
			
			
		
			cl1.setName(name);
			cl1.setCustomer_city(customer_city);
			cl1.setCustomerId(customerId);
			
		System.out.print(cl1.getName());	
		System.out.print(cl1.getCustomer_city());
		System.out.print(cl1.getCustomerId());
			
			
			
			
			System.out.println(cl1);
			 
			customer c2 = new customer(name ,customerId,customer_city);
			System.out.print(c2);
			
		
	}

}
