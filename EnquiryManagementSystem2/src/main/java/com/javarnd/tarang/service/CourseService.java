package com.javarnd.tarang.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.javarnd.tarang.model.Course;

public interface CourseService {

	List<Course> getAllCourses();

	Course addCourse(@Valid Course course);

	void updateCourse(int id, @Valid Course course);

	void deleteCourse(int id);

	Course getCourse(int id);

	
}
