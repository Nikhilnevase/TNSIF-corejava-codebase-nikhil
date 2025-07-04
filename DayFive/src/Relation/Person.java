package Relation;

public class Person {
	private String Name;
	private Address address;
	
	
	public Person(String name, Address address) {
		System.out.print("This is default contructor");
		Name = name;
		this.address = address;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void DisplayInfo() {
		System.out.print("Name-"+ getName());
		System.out.print("Address-"+getAddress());
	}


	@Override
	public String toString() {
		return "Person [Name=" + Name + ", address=" + address + "]";
	}
	
	
	
	

}
