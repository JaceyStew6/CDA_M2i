package com.example.Exercice06_Forum.service;

import com.example.Exercice06_Forum.dao.MessageRepository;
import com.example.Exercice06_Forum.entity.Message;
import com.example.Exercice06_Forum.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService implements IMessageService{
    private final MessageRepository messageRepository;
//    private final UserService userService;

    public MessageService(MessageRepository messageRepository, UserService userService) {
        this.messageRepository = messageRepository;
//        this.userService = userService;
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

    @Override
    public Message saveMessage(Message message) {
        message.setPostHour(LocalDateTime.now());
        messageRepository.save(message);
        return message;
    }

    //--------------------------------FIN CODE PROVISOIRE------------------------------

    @Override
    public void deleteMessage(int id) {

    }
}