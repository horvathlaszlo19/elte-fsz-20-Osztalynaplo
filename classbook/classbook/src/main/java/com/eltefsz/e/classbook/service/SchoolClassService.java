package com.eltefsz.e.classbook.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.School;
import com.eltefsz.e.classbook.domain.SchoolClass;
import com.eltefsz.e.classbook.domain.Subject;
import com.eltefsz.e.classbook.domain.Teacher;
import com.eltefsz.e.classbook.repository.SchoolClassRepository;

@Service
public class SchoolClassService {

	@Autowired
	private SchoolClassRepository schoolClassRepository;
	
	
	public void addSchoolClass(String name, int schoolYear, School school) {
		SchoolClass schoolClass = new SchoolClass(name, schoolYear, school);
		schoolClassRepository.save(schoolClass);
	}
	
	public List<SchoolClass> getAllSchoolClasses() {
		Iterable<SchoolClass> foundSchoolClasses = schoolClassRepository.findAll();
		List<SchoolClass> result = new ArrayList<SchoolClass>();
		foundSchoolClasses.forEach(result::add);
		return result;
	}
	
	public SchoolClass findSchoolClassById(int id) {
		SchoolClass result = new SchoolClass();
		if( schoolClassRepository.findById(id).isPresent() ) {
			result = schoolClassRepository.findById(id).get();
		}
		return result;
	}
	
	public List<Teacher> getTeachers(SchoolClass schoolClass) {
		return schoolClass.getTeachers();
	}
	
	public List<Subject> getSubjects(SchoolClass schoolClass){
		List<Subject> subjects = new ArrayList<Subject>();
		schoolClass.getTeachers().forEach(t -> subjects.add( t.getSubject() ));
		return subjects;
	}
	
	public School getSchool(SchoolClass schoolClass) {
		return schoolClass.getSchool();
	}
	
	public Map<String,String> getTeachersWithSubjects(SchoolClass schoolClass){
		Map<String,String> teachersWithSubjects = new HashMap<String,String>();
		this.getTeachers(schoolClass).forEach(t -> teachersWithSubjects.put(t.getName(), t.getSubject().toString()));
		return teachersWithSubjects;
	}
}
