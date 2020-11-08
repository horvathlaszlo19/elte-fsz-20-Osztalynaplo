package com.eltefsz.teamE.classbook.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	
	private String city;
	
	private boolean daycare;
	
	
	@OneToMany(mappedBy = "school")
	private List<SchoolClass> schoolClasses;
	
	
	public School () {}
	public School(int id, String name, String city, boolean daycare) {
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
	
	public List<SchoolClass> getSchoolClasses () {
		return schoolClasses;
	}
	
	public void setSchoolClasses (List<SchoolClass> schoolClasses) {
		this.schoolClasses = schoolClasses;
	}
	
}
