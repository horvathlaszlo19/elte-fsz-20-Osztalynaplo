package com.eltefsz.teamE.classbook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int age;
	private boolean sex;
	@NotEmpty
	private String name;
	@NotEmpty
	private String username;
	@NotEmpty
	private String password;
	
	private double GPA;
	@ManyToOne
	private SchoolClass studentSchoolClass;
	
	Student(){}
	
	
	public Student(long id, int age, boolean sex, @NotEmpty String name, @NotEmpty String username,
			@NotEmpty String password) {
		super();
		this.id = id;
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.username = username;
		this.password = password;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

}
