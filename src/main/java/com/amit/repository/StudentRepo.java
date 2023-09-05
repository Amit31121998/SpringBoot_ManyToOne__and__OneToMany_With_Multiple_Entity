package com.amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
