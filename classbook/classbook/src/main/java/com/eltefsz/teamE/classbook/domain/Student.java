package com.eltefsz.teamE.classbook.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student extends Person {
	
	private double GPA;
	
	@ManyToOne
	private SchoolClass studentSchoolClass;
	
	@OneToMany(mappedBy = "gradeStudent")
	private List<Grade> grades;
	
	

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	
	public SchoolClass getStudentSchoolClass () {
		return studentSchoolClass;
	}
	
	public void setStudentSchoolClass (SchoolClass studentSchoolClass) {
		this.studentSchoolClass = studentSchoolClass;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

}
