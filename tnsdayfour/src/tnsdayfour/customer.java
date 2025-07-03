package tnsdayfour;

public class customer {
	private String Name;
	private int customerId;
	private String customer_city;
	  
	
	//defaulat constructor
	 
	public customer() {
		System.out.print("This is defaulat cunstructor");
	} 

         // parameterize constructor
       public customer(String name, int customerId, String customer_city) {
		
		System.out.print("hello this is para constructor");
		
		Name = name;
		this.customerId = customerId;
		this.customer_city = customer_city;
	 }

        

	 // getter and setter 
	 public String getName() {
		 return Name;
	 }


	 public void setName(String name) {
		 Name = name;
	 }


	 public int getCustomerId() {
		 return customerId;
	 }


	 public void setCustomerId(int customerId) {
		 this.customerId = customerId;
	 }


	 public String getCustomer_city() {
		 return customer_city;
	 }


	 public void setCustomer_city(String customer_city) {
		 this.customer_city = customer_city;
	 }

        //to string
	 @Override
	 public String toString() {
		return "customer [Name=" + Name + ", customerId=" + customerId + ", customer_city=" + customer_city + "]";
	 }
	   
	 
	 
	 
	 
	 

}
