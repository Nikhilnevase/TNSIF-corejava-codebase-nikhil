package tnsdaythree;

public class personINFO {
	private String Name;
	private int Age ;
	private String 	Gender ;
	private int Income ;
	private  long Mobile_number ;
	private int Tax;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getIncome() {
		return Income;
	}
	public void setIncome(int income) {
		Income = income;
	}
	public long getMobile_number() {
		return Mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		Mobile_number = mobile_number;
	}
	public int getTax() {
		return Tax;
	}
	public void setTax(int tax) {
		Tax = tax;
	}

	@Override
	public String toString() {
		return "personINFO [Name=" + Name + ", Age=" + Age + ", Gender=" + Gender + ", Income=" + Income
				+ ", Mobile_number=" + Mobile_number + ", Tax=" + Tax + "]";
	}
	


}
