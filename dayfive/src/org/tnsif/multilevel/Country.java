package org.tnsif.multilevel;

public class Country {
	
	private String countryname;
	private String countrycapital;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(String countrycapital) {
		this.countrycapital = countrycapital;
	}
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", countrycapital=" + countrycapital + "]";
	}
	
	

}