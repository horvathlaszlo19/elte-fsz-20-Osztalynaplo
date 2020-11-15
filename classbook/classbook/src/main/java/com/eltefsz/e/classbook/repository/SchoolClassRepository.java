package com.eltefsz.e.classbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eltefsz.e.classbook.domain.SchoolClass;

@Repository
public interface SchoolClassRepository extends CrudRepository<SchoolClass, Integer> {

}
