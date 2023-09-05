package com.amit.service;

import java.util.List;

import com.amit.binding.SchoolBinding;
import com.amit.entity.School;

public interface SchoolService {
	
	public boolean saveSchoolDetails(SchoolBinding school);
	
	public boolean updateSchoolDetails(School school);
	
	public boolean deleteSchoolDetails(Integer id);
	
	public List<School> getSchoolDetails();
	
	public School getSchoolDetailsById(Integer id);

}
