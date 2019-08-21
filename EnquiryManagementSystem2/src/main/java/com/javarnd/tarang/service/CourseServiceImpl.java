package com.javarnd.tarang.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javarnd.tarang.dao.CourseDao;
import com.javarnd.tarang.model.Course;

@Transactional
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao courseDao;
	@Override	
	public List<Course> getAllCourses() {
		return courseDao.getAllCourses();
	}
	@Override
	public Course addCourse(@Valid Course course) {
		return courseDao.addCourse(course);
	}
	@Override
	public void updateCourse(int id, @Valid Course course) {
		courseDao.updateCourse(id, course);
		
	}
	@Override
	public void deleteCourse(int id) {
		courseDao.deleteCourse(id);
		
	}
	@Override
	public Course getCourse(int id) {
		return courseDao.getCourse(id);
	}


}
