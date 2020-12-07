package com.eltefsz.e.classbook.webdomain;

public class AddSchoolObject {

	protected int id;
	protected String name;
	protected String city;
	protected boolean daycare;
	
	
	public int getId () {
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}

	public String getCity () {
		return city;
	}
	public void setCity (String city) {
		this.city = city;
	}

	public boolean getDaycare () {
		return daycare;
	}
	
	public void setDaycare (boolean daycare) {
		this.daycare = daycare;
	}
	
	
	

}
