package com.example.Exercice06_Forum.service;

import com.example.Exercice06_Forum.dao.TopicRepository;
import com.example.Exercice06_Forum.entity.Topic;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class TopicService implements ITopicService{

    private final TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    @Override
    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    @Override
    public Topic saveTopic(Topic topic) {
        topic.setPostHour(LocalDateTime.now());
        topicRepository.save(topic);
        return topic;
    }

    @Override
    public void deleteTopic(int id) {

    }

    @Override
    public Topic getTopicById(int id) {
        return topicRepository.findById(id).orElse(null);
    }
}
