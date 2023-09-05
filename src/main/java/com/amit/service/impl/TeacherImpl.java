package com.amit.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.entity.Teacher;
import com.amit.repository.TeacherRepo;
import com.amit.service.TeacherService;

@Service
public class TeacherImpl implements TeacherService {

	@Autowired
	private TeacherRepo teacherRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public boolean saveTeacherDetail(Teacher teacher) {
		teacherRepo.save(teacher);

		return true;
	}

	@Override
	public boolean updateTeacherDetail(Teacher teacher) {

		Teacher teach = teacherRepo.findById(teacher.getId()).get();
		modelMapper.map(teacher, teach);
		teacherRepo.save(teach);
		return true;
	}

	@Override
	public boolean deleteTeacherDetail(Integer id) {

		teacherRepo.deleteById(id);
		return true;
	}

	@Override
	public List<Teacher> getTeacherDetails() {
		return teacherRepo.findAll();
	}

	@Override
	public Teacher getTeacherDetailById(Integer id) {
		return teacherRepo.findById(id).get();
	}
}
