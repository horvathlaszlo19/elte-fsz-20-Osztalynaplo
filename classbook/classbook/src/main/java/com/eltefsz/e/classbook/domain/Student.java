package com.eltefsz.e.classbook.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student extends Person {
	
	private double GPA;
	
	@ManyToOne
	private SchoolClass studentSchoolClass;
	
	@OneToMany(mappedBy = "gradeStudent")
	private List<Grade> grades;
	
	
	public Student() {}
	public Student(int age, boolean sex, @NotEmpty String name, @NotEmpty String username,
			@NotEmpty String password) {
		super();
		this.userType=UserType.STUDENT;
	}

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
