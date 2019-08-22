package com.javarnd.tarang.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.javarnd.tarang.crudrepository.TopicRepository;
import com.javarnd.tarang.model.Topic;

@Transactional
@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics(){
		List<Topic> topics= new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);  // :: method reference call addd method for all topics 
		return topics;
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
