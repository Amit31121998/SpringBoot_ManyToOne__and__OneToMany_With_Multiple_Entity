package com.amit.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.binding.SchoolBinding;
import com.amit.entity.School;
import com.amit.entity.Teacher;
import com.amit.repository.SchoolRepo;
import com.amit.repository.TeacherRepo;
import com.amit.service.SchoolService;

@Service
public class SchoolImpl implements SchoolService {
	
	@Autowired
	private SchoolRepo schoolRepo;
	
	@Autowired
	private TeacherRepo teacherRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public boolean saveSchoolDetails(SchoolBinding school) {
		
		Teacher teacher = teacherRepo.findById(school.getTeacherId()).get();
		
		School entity=new School();
		modelMapper.map(school, entity);
		entity.setTeacher(teacher);
		
		schoolRepo.save(entity);
		return true;
	}

	@Override
	public boolean updateSchoolDetails(School school) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSchoolDetails(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<School> getSchoolDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public School getSchoolDetailsById(Integer id) {
		
		return schoolRepo.findById(id).get();
	}

}
