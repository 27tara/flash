package com.javarnd.tarang.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.javarnd.tarang.crudrepository.CourseRepository;
import com.javarnd.tarang.dao.CourseDao;
import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Topic;

@Transactional
@Service
public class CourseService {
	
	@Autowired
	private CourseDao courseDao;

	public List<Course> getAllCourses(String topicId){
		return courseDao.getAllCourses(topicId);
	}
	public Optional<Course> getCourse(String id) {
		return courseDao.getCourse(id);
		 
	}
	public Course addCourse(Course course) {
		return courseDao.addCourse(course);	
	}
	public void updateCourse(Course course) {
		courseDao.updateCourse(course);
	}
	public void deleteCourse(String id) {
		courseDao.deleteCourse(id);
		
	}
}
