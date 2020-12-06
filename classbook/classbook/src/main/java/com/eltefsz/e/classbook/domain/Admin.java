package com.eltefsz.e.classbook.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Admin extends Person {
	
	public Admin() {}
	public Admin(int age, boolean sex, @NotEmpty String name, @NotEmpty String username,
			@NotEmpty String password,UserType usertype) {
		super();
	}
}
