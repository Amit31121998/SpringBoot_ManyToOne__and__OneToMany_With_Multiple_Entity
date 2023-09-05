package com.amit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.binding.SchoolBinding;
import com.amit.entity.School;
import com.amit.service.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolRestController {
	
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveSchool(@RequestBody SchoolBinding school){
		
		boolean status = schoolService.saveSchoolDetails(school);
		if(status) {
			return new ResponseEntity<>("success",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<>("failed",HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getSchool/{id}")
	public ResponseEntity<School> getSchool(@PathVariable Integer id){
		School school = schoolService.getSchoolDetailsById(id);
		return new ResponseEntity<>(school,HttpStatus.OK);
	}

}
