package com.nse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nse.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
