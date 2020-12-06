package com.eltefsz.e.classbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eltefsz.e.classbook.domain.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
	
	Admin findByUsername(String username);

}
