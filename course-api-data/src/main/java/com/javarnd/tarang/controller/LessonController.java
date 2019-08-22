package com.javarnd.tarang.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Lesson;
import com.javarnd.tarang.service.LessonService;

@RestController
public class LessonController {

	@Autowired
	private LessonService lessonService;
	
	@GetMapping("/topics/{id}/courses/{courseId}/lessons")
	public List<Lesson> getAllLessons(@PathVariable String courseId, @PathVariable String id) {
		return lessonService.getAllLessons(courseId);
	}
	
	@GetMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public Optional<Lesson> getLesson(@PathVariable String id) {
		return lessonService.getLesson(id);
	}
	@PostMapping("/topics/{topicId}/courses/{courseId}/lessons")
	public Lesson addLesson(@RequestBody Lesson lesson, @PathVariable String topicId,@PathVariable String courseId) {
		lesson.setCourse(new Course(courseId, "", "",""));
		 return lessonService.addLesson(lesson);
	}
	@PutMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void updateLesson(@RequestBody Lesson lesson, @PathVariable String id,@PathVariable String topicId,@PathVariable String courseId) {
		lesson.setCourse(new Course(courseId,"", "", ""));
		lessonService.updateLesson(lesson);
	}
	@DeleteMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
	public void deleteLesson(@PathVariable String id) {
		lessonService.deleteLesson(id);
	}
}
