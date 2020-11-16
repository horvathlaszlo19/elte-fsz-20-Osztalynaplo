package com.eltefsz.e.classbook.domain;

import java.util.List;

import javax.persistence.Entity;


public class ElementarySchool extends School {
	
	
	public ElementarySchool () {}
	public ElementarySchool(int id, String name, String city, boolean daycare) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.daycare = daycare;
	}
	
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
