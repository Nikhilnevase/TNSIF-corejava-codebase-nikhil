package singleInheritance;

public class citizen {
	private String name;
	private String adharNo;
	private String address;
	private long phone;
	
	public citizen() {
		System.out.print("Citizen DEfault constructor created ");
		
	}

	public citizen(String name, String adharNo, String address, long phone) {
		
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "citizen [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	

}
