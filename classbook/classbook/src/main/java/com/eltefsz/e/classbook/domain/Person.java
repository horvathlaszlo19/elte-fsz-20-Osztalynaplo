package com.eltefsz.e.classbook.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@MappedSuperclass
public class Person {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;
	protected int age;
	protected boolean sex;
	@NotEmpty
	protected String name;
	//@NotEmpty
	@Column(nullable = false, unique = true)
	protected String username;
	@NotEmpty
	protected String password;
	protected UserType userType;
	
	
	public Person() {}
	public Person(int age, boolean sex, @NotEmpty String name, @NotEmpty String username,
			@NotEmpty String password,UserType usertype) {
		super();
		this.age = age;
		this.sex = sex;
		this.name = name;
		this.username = username;
		this.password = password;
		this.userType = usertype;
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
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	
	
	
}
