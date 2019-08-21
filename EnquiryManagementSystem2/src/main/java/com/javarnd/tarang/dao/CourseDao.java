package com.javarnd.tarang.dao;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.javarnd.tarang.model.Course;

public interface CourseDao {

	List<Course> getAllCourses();

	Course addCourse(@Valid Course course);

	Course updateCourse(int id, @Valid Course course);

	void deleteCourse(int id);

	Course getCourse(int id);

}
