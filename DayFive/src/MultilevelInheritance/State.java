package MultilevelInheritance;

public class State extends Country{
	
     private String statename;
     private String ststelanguage;
	 public String getStatename() {
		 return statename;
	 }
	 public void setStatename(String statename) {
		 this.statename = statename;
	 }
	 public String getStstelanguage() {
		 return ststelanguage;
	 }
	 public void setStstelanguage(String ststelanguage) {
		 this.ststelanguage = ststelanguage;
	 }
	 @Override
	 public String toString() {
		return "State [statename=" + statename + ", ststelanguage=" + ststelanguage + ", getCountryname()="
				+ getCountryname() + ", getCapital()=" + getCapital() + "]";
	 }
     
     
     

}
