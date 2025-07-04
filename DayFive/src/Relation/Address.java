package Relation;

public class Address {
	
	String street ;
	String City;
	String State;
	String Postal_code;
	


	public Address() {
		super();
	}




	public Address(String street, String city, String state, String postal_code) {
		super();
		this.street = street;
		City = city;
		State = state;
		Postal_code = postal_code;
	}




	public String getStreet() {
		return street;
	}




	public void setStreet(String street) {
		this.street = street;
	}




	public String getCity() {
		return City;
	}




	public void setCity(String city) {
		City = city;
	}




	public String getState() {
		return State;
	}




	public void setState(String state) {
		State = state;
	}




	public String getPostal_code() {
		return Postal_code;
	}




	public void setPostal_code(String postal_code) {
		Postal_code = postal_code;
	}
	
	
	
	

	
	
}
