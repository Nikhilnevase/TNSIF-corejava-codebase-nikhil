
package tnsdaythree;
import java.util.Scanner;
public class personDemo {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		 
		System.out.print("Enter the Name ");
		String name = sc.next();
		System.out.print("Enter the Age ");
		int age = sc.nextInt();
		System.out.print("Enter the Gender");
		String gender = sc.next();
		System.out.print("Enter the Income ");
		int income = sc.nextInt();
		System.out.print("Enter the Mobile Number");
		long mobilenumber =sc.nextLong();
		
		
		
		personINFO person = new personINFO();
		person.setName(name);
	    person.setAge(age);
	    person.setGender(gender);
	    person.setIncome(income);
	    person.setMobile_number(mobilenumber);
	    
	    System.out.println(person.getName());
	    System.out.println(person.getAge());
	    System.out.println(person.getGender());
	    System.out.println(person.getIncome());
	    System.out.println(person.getMobile_number());
	    System.out.println(person.getTax());
	    System.out.println(person);
	    
	    
	    TaxCalculation cal = new TaxCalculation();
	    cal.calculatetax(person);
	     System.out.println(person);
	    
	    
	    
	    
	    
		
		
	}

}
