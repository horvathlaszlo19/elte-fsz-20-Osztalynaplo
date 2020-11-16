package com.eltefsz.e.classbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.School;
import com.eltefsz.e.classbook.repository.SchoolRepository;

@Service
public class SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	
	
	public void addSchool(String name, String city, boolean daycare) {
		School school = new School(name, city, daycare);
		schoolRepository.save(school);
	}
	
	public List<School> getAllSchools() {
		Iterable<School> foundSchools = schoolRepository.findAll();
		List<School> result = new ArrayList<School>();
		foundSchools.forEach(result::add);
		return result;
	}
	
	public School findSchoolById(int id) {
		School result = new School();
		if( schoolRepository.findById(id).isPresent() ) {
			result = schoolRepository.findById(id).get();
		}
		return result;
	}
	
}
