package com.info.beans;

public class CompanyDetails {
	
	private String companyName;
	
	private String location;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "CompanyDetails [companyName=" + companyName + ", location=" + location + "]";
	}
	
	

}
