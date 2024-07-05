package com.example.Exercice06_Forum.service;

import com.example.Exercice06_Forum.entity.Message;

import java.util.List;

public interface IMessageService {
    List<Message> getAllMessages();
/*    Message saveMessage(Message message);*/
    void deleteMessage(int id);
    Message saveMessage(Message message, int id);

}
