package com.javarnd.tarang.crudrepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Lesson;
import com.javarnd.tarang.model.Topic;

public interface LessonRepository extends CrudRepository<Lesson, String>{

	public List<Lesson> findByCourseId(String courseId);
}
