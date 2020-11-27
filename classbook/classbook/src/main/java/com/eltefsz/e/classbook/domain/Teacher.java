package com.eltefsz.e.classbook.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Teacher extends Person {
	
	private Subject subject;
	
	@ManyToMany
	private List<SchoolClass> teacherSchoolClasses;
	
	
	
	public Teacher() {}
	public Teacher(int age, boolean sex, @NotEmpty String name, @NotEmpty String username,
			@NotEmpty String password, Subject subject) {
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.username = username;
		this.password = password;
		this.subject = subject;
		this.userType = UserType.TEACHER;
	}



	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public List<SchoolClass> getTeacherSchoolClasses() {
		return teacherSchoolClasses;
	}
	
	public void setTeacherSchoolClasses(List<SchoolClass> teacherSchoolClasses) {
		this.teacherSchoolClasses = teacherSchoolClasses;
	}
	
}
