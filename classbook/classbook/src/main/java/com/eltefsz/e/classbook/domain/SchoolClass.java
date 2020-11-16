package com.eltefsz.e.classbook.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SchoolClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private int schoolYear;
	
	
	@ManyToOne
	private School school;
	
	@OneToMany(mappedBy = "studentSchoolClass")
	private List<Student> students;

	@ManyToMany(mappedBy = "teacherSchoolClasses")
	private List<Teacher> teachers;
	
	public SchoolClass () {}
	public SchoolClass(String name, int schoolYear, School school) {
		super();
		this.name = name;
		this.schoolYear = schoolYear;
		this.school = school;
	}
	
	public int getId () {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	
	public School getSchool () {
		return school;
	}
	public void setSchool (School school) {
		this.school = school;
	}
	
	public List<Student> getStudents () {
		return students;
	}
	public void setStudents (List<Student> students) {
		this.students = students;
	}
	
	public List<Teacher> getTeachers () {
		return teachers;
	}
	public void setTeachers (List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}

	
}
