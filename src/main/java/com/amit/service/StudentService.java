package com.amit.service;

import java.util.List;

import com.amit.entity.Student;

public interface StudentService {

	public boolean saveStudentDetails(Student student);

	public boolean updateStudentDetails(Student student);

	public boolean deleteStudentDetails(Integer id);

	public List<Student> getStudentDetails();

	public Student getStudentDetailsById(Integer id);
}
