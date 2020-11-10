package com.eltefsz.teamE.classbook.domain;

public class HighSchool extends School {
	
	protected boolean daycare = false;
	private boolean specialized;
	
	
	public HighSchool() {}
	public HighSchool(int id, String name, String city, boolean specialized) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.specialized = specialized;
	}

	
	public boolean isSpecialized() {
		return specialized;
	}

	public void setSpecialized(boolean specialized) {
		this.specialized = specialized;
	}
	
}
