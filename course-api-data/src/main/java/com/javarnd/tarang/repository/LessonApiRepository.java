package com.javarnd.tarang.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Lesson;

public interface LessonApiRepository extends JpaRepository<Lesson, String>{
	
}
