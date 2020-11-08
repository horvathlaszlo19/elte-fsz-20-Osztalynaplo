package com.eltefsz.teamE.classbook.domain;

import java.time.LocalDateTime;

public class Grade {

	private Subject subject;
	
	private GradeValue value;
	
	private LocalDateTime date;
	
	public Grade () {}
	public Grade(Subject subject, GradeValue value, LocalDateTime date) {
		super();
		this.subject = subject;
		this.value = value;
		this.date = date;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public GradeValue getValue() {
		return value;
	}

	public void setValue(GradeValue value) {
		this.value = value;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
