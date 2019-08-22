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

import com.javarnd.tarang.crudrepository.TopicRepository;
import com.javarnd.tarang.model.Course;
import com.javarnd.tarang.model.Topic;
import com.javarnd.tarang.repository.TopicApiRepository;

@Repository
public class TopicDao {
	
	@Autowired
	TopicApiRepository topicRepository;

	public List<Topic> getAllTopics(){
		return topicRepository.findAll();
				
	}
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
		 
	}
	public Topic addTopic(Topic topic) {
		return topicRepository.save(topic);
	}
	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
		
	}
}
