package com.javarnd.tarang.crudrepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Topic;

public interface CourseRepository extends CrudRepository<Course, String>{

	public List<Course> findByTopicId(String topicId);
}
