package com.amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
