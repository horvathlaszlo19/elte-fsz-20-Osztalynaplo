package com.eltefsz.e.classbook.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private Subject subject;
	
	private GradeValue value;
	
	private LocalDateTime date;
	
	@ManyToOne
	private Student gradeStudent;
	
	public Grade () {}
	public Grade(Subject subject, GradeValue value, LocalDateTime date) {
		super();
		this.subject = subject;
		this.value = value;
		this.date = date;
	}
	
	public long getId () {
		return id;
	}
	
	public void setId (long id) {
		this.id = id;
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
	
	public Student getGradeStudent() {
		return gradeStudent;
	}
	
	public void setGradeStudent(Student gradeStudent) {
		this.gradeStudent = gradeStudent;
	}
	
}
