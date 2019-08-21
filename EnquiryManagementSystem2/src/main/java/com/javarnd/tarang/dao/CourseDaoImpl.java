package com.javarnd.tarang.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javarnd.tarang.exception.ResourceNotFoundException;
import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.repository.CourseRepository;

@Repository
public class CourseDaoImpl implements CourseDao {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(){
		List<Course> courses= new ArrayList<>();
		courseRepository.findAll()
		.forEach(courses::add);  
		return courses;
	}
	public Course getCourse(int id) {
		return courseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Course", "id", id));
		 
	}
	public Course addCourse(Course course) {
		return courseRepository.save(course);	
	}
	public Course updateCourse(int id, Course course) {
		Course course1 = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course", "id", id));

		course1.setDuration(course.getDuration());
		course1.setName(course.getName());

        Course updatedCourse = courseRepository.save(course);
        return updatedCourse;
	}
	public void deleteCourse(int id) {
		courseRepository.deleteById(id);
		
	}
}
