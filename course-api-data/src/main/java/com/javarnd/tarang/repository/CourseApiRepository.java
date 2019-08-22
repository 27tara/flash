package com.javarnd.tarang.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javarnd.tarang.model.Course;

public interface CourseApiRepository extends JpaRepository<Course, String>{

	Optional<Course> findById(String id);

	void deleteById(String id);

}
