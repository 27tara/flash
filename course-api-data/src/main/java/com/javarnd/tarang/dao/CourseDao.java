package com.javarnd.tarang.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.javarnd.tarang.crudrepository.CourseRepository;
import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Topic;
import com.javarnd.tarang.repository.CourseApiRepository;

@Repository
public class CourseDao {
	
	@Autowired
	CourseApiRepository courseRepository;

	public List<Course> getAllCourses(String topicId){
		return courseRepository.findAll();
	}
	public Optional<Course> getCourse(String id) {
		return courseRepository.findById(id);
		 
	}
	public Course addCourse(Course course) {
		return courseRepository.save(course);	
	}
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
		
	}
}
