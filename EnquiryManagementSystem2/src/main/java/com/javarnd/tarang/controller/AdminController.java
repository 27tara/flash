package com.javarnd.tarang.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javarnd.tarang.dao.CourseDao;
import com.javarnd.tarang.dao.EnquiryDao;
import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Enquiry;
import com.javarnd.tarang.service.CourseService;
import com.javarnd.tarang.service.EnquiryService;
@RequestMapping("/admin")
@RestController
public class AdminController {

	@Autowired
	private EnquiryService enquiryService;
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
	@PostMapping("/courses")
	public Course addCourse(@Valid @RequestBody Course course) {
		 return courseService.addCourse(course);
	}
	@PutMapping("/courses/{id}")
	public void updateCourse(@Valid @RequestBody Course course, @PathVariable int id) {
		courseService.updateCourse(id,course);
	}
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
	}
	
	@GetMapping("/enquiries")
	public List<Enquiry> getAllEnquiries() {
		return enquiryService.getEnquiries();
	}
	@PutMapping("/courses/{courseId}/enquiries/{id}")
	public void updateEnquiry(@Valid @RequestBody Enquiry enquiry, @PathVariable int id,@PathVariable int courseId) {
		enquiry.setCourse(new Course(courseId, "", ""));
		enquiryService.updateEnquiry(enquiry);
	}

}
