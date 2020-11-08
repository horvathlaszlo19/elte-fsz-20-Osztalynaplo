package com.eltefsz.teamE.classbook.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Teacher {

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
	
	private Subject subject;
	@ManyToMany
	private List<SchoolClass> schoolClasses;
	
	Teacher(){}
	
	
	public Teacher(long id, int age, boolean sex, @NotEmpty String name, @NotEmpty String username,
			@NotEmpty String password, Subject subject) {
		super();
		this.id = id;
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.username = username;
		this.password = password;
		this.subject = subject;
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public List<SchoolClass> getSchoolClasses() {
		return schoolClasses;
	}
	
	public void setSchoolClasses(List<SchoolClass> schoolClasses) {
		this.schoolClasses = schoolClasses;
	}
	
}
