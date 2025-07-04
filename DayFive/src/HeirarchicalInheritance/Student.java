package HeirarchicalInheritance;

public class Student extends Person{
	
	private String clas;
	private float percent;
	public Student(String string, String string2, String string3, float f) {
		
	}
	public Student(String clas, float percent) {
		super();
		this.clas = clas;
		this.percent = percent;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [clas=" + clas + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	

}
