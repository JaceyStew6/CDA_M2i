package com.example.Exercice06_Forum.service;

import com.example.Exercice06_Forum.entity.Topic;

import java.util.List;

public interface ITopicService {
    List<Topic> getAllTopics();
    Topic saveTopic(Topic topic);
    void deleteTopic(int id);
    Topic getTopicById(int id);
}
