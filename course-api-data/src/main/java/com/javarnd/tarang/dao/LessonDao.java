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
import com.javarnd.tarang.crudrepository.LessonRepository;
import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Lesson;
import com.javarnd.tarang.model.Topic;
import com.javarnd.tarang.repository.LessonApiRepository;

@Repository
public class LessonDao {
	
	@Autowired
	LessonApiRepository lessonApiRepository;

	public List<Lesson> getAllLessons(String courseId){
		return lessonApiRepository.findAll();
	}
	public Optional<Lesson> getLesson(String id) {
		return lessonApiRepository.findById(id);
		 
	}
	public Lesson addLesson(Lesson lesson) {
		return lessonApiRepository.save(lesson);
	}
	public void updateLesson(Lesson lesson) {
		lessonApiRepository.save(lesson);
	}
	public void deleteLesson(String id) {
		lessonApiRepository.deleteById(id);
		
	}
}
