package MultilevelInheritance;

public class City extends State {
	
	
	private String cityname;
	private String areaname;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setArea(String area) {
		this.areaname = area;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", area=" + areaname + ", getStatename()=" + getStatename()
				+ ", getStstelanguage()=" + getStstelanguage() + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	
	
	

}
