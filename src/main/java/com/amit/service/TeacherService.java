package com.amit.service;

import java.util.List;

import com.amit.entity.School;
import com.amit.entity.Teacher;

public interface TeacherService {

	public boolean saveTeacherDetail(Teacher teacher);

	public boolean updateTeacherDetail(Teacher teacher);

	public boolean deleteTeacherDetail(Integer id);

	public List<Teacher> getTeacherDetails();

	public Teacher getTeacherDetailById(Integer id);

}
