package com.javarnd.tarang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javarnd.tarang.model.Topic;

public interface TopicApiRepository extends JpaRepository<Topic, String>{

}
