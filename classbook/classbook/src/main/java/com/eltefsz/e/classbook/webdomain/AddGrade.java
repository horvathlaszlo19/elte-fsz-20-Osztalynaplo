package com.eltefsz.e.classbook.webdomain;

import com.eltefsz.e.classbook.domain.GradeValue;
import com.eltefsz.e.classbook.domain.Subject;

public class AddGrade {
	
	private long id;
	private Subject subject;
	private GradeValue gradeValue;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public GradeValue getGradeValue() {
		return gradeValue;
	}
	public void setGradeValue(GradeValue gradeValue) {
		this.gradeValue = gradeValue;
	}

	
	

}
