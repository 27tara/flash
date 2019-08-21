package com.javarnd.tarang.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javarnd.tarang.dao.CourseDao;
import com.javarnd.tarang.dao.EnquiryDao;
import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Enquiry;
import com.javarnd.tarang.service.CourseService;
import com.javarnd.tarang.service.EnquiryService;

@RestController
public class EnquiryController {

	@Autowired
	private EnquiryService enquiryService;
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable int id) {
		return courseService.getCourse(id);
	}
	
	@GetMapping("/courses/{courseId}/enquiries/{id}")
	public Optional<Enquiry> getEnquiry(@PathVariable int id) {
		return enquiryService.getEnquiry(id);
	}
	@PostMapping("/courses/{courseId}/enquiries")
	public Enquiry addEnquiry(@Valid @RequestBody Enquiry enquiry, @PathVariable int courseId) {
		enquiry.setCourse(new Course(courseId, "", ""));
		 return enquiryService.addEnquiry(enquiry);
	}
	@PutMapping("/courses/{courseId}/enquiries/{id}")
	public void updateEnquiry(@Valid @RequestBody Enquiry enquiry, @PathVariable int id,@PathVariable int courseId) {
		enquiry.setCourse(new Course(courseId, "", ""));
		enquiryService.updateEnquiry(enquiry);
	}
	@DeleteMapping("/courses/{courseId}/enquiries/{id}")
	public void deleteEnquiry(@PathVariable int id) {
		enquiryService.deleteEnquiry(id);
	}
}
