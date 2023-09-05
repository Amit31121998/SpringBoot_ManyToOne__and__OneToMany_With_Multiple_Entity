package com.amit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.entity.Student;
import com.amit.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Autowired
	private StudentService stuRepo;

	@GetMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		boolean status = stuRepo.saveStudentDetails(student);

		if (status) {
			return new ResponseEntity<>("", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("", HttpStatus.NOT_FOUND);
		}
	}
}
