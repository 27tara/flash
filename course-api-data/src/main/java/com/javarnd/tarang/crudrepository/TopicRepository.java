package com.javarnd.tarang.crudrepository;

import org.springframework.data.repository.CrudRepository;

import com.javarnd.tarang.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
