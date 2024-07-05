package com.example.Exercice06_Forum.service;

import com.example.Exercice06_Forum.dao.MessageRepository;
import com.example.Exercice06_Forum.dao.TopicRepository;
import com.example.Exercice06_Forum.entity.Message;
import com.example.Exercice06_Forum.entity.Topic;
import com.example.Exercice06_Forum.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService implements IMessageService{
    private final MessageRepository messageRepository;
    private final TopicRepository topicRepository;
    private final TopicService topicService;
    //    private final UserService userService;

    public MessageService(MessageRepository messageRepository, UserService userService, TopicRepository topicRepository, TopicService topicService) {
        this.messageRepository = messageRepository;
//        this.userService = userService;
        this.topicRepository = topicRepository;
        this.topicService = topicService;
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    //--------------------------------CODE PROVISOIRE------------------------------
    //TODO remodifier le code une fois que j'aurai un user
/*    @Override
    public Message saveMessage(Message message) {
        User userExist = userService.getUserById(message.getUserId());
        if (userExist.getId() != 0){
            message.setPostHour(LocalDateTime.now());
            messageRepository.save(message);
        }else {
            return null;
        }
        return null;
    }*/

/*    @Override
    public Message saveMessage(Message message) {
        message.setPostHour(LocalDateTime.now());
        messageRepository.save(message);
        return message;
    }*/

    @Override
    public Message saveMessage(Message message, int id) {
        Topic topic = topicRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Topic not found"));
        message.setTopic(topic);
        message.setPostHour(LocalDateTime.now());
        return messageRepository.save(message);
    }

    //--------------------------------FIN CODE PROVISOIRE------------------------------

    @Override
    public void deleteMessage(int id) {

    }
}