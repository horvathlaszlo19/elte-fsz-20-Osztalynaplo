package com.eltefsz.e.classbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.repository.SchoolClassRepository;

@Service
public class SchoolClassService {

	@Autowired
	private SchoolClassRepository schoolClassRepository;
	
}
