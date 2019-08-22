package com.javarnd.tarang.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.javarnd.tarang.crudrepository.CourseRepository;
import com.javarnd.tarang.crudrepository.LessonRepository;
import com.javarnd.tarang.dao.LessonDao;
import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Lesson;
import com.javarnd.tarang.model.Topic;

@Transactional
@Service
public class LessonService {
	
	@Autowired
	private LessonDao lessonDao;

	public List<Lesson> getAllLessons(String courseId){
		return lessonDao.getAllLessons(courseId);
	}
	public Optional<Lesson> getLesson(String id) {
		return lessonDao.getLesson(id);
		 
	}
	public Lesson addLesson(Lesson lesson) {
		return lessonDao.addLesson(lesson);	
	}
	public void updateLesson(Lesson lesson) {
		lessonDao.updateLesson(lesson);
	}
	public void deleteLesson(String id) {
		lessonDao.deleteLesson(id);
		
	}
}
