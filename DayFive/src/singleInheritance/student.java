package singleInheritance;

public class student extends citizen{
	
	private int rollNo;
	private String collegename;
	
	// non para constructor
	public student() {
		super();
		
	}

	public student(int rollNo, String collegename,String name, String adharNo, String address, long phone) {
		super(name, adharNo,  address, phone);
		this.rollNo = rollNo;
		this.collegename = collegename;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAdharNo()=" + getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
	
	
	

}
