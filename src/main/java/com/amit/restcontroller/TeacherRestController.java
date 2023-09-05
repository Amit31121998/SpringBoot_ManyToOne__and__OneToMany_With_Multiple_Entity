package com.amit.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amit.entity.Student;
import com.amit.entity.Teacher;
import com.amit.service.TeacherService;

@RestController
public class TeacherRestController {

	@Autowired
	private TeacherService teacherService;

	@PostMapping("/save")
	public ResponseEntity<String> saveTeacher(@RequestBody Teacher teacher) {
		List<Student> students = teacher.getStudents();
		System.out.println(students);
		boolean status = teacherService.saveTeacherDetail(teacher);
		if (status) {
			return new ResponseEntity<String>("save success", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("problem occure", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getTeacher/{tId}")
	public ResponseEntity<Teacher> getTeacher(@PathVariable Integer tId) {
	 Teacher detailById = teacherService.getTeacherDetailById(tId);
		return new ResponseEntity<>(detailById, HttpStatus.OK);
	}
	
	@GetMapping("/getAllTeacher")
	public ResponseEntity<List<Teacher>> getAllTeacher() {
	  List<Teacher> details = teacherService.getTeacherDetails();
			 return new ResponseEntity<>(details, HttpStatus.OK);
	}
	
	@GetMapping("/delete")
	public ResponseEntity<String> deleteTeacher() {
	       teacherService.getTeacherDetails();
			 return new ResponseEntity<>("deleted success", HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<String> updateTeacher(@RequestBody Teacher teacher) {
		boolean status = teacherService.updateTeacherDetail(teacher);
		if (status) {
			return new ResponseEntity<String>("update success", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>("problem occure", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}