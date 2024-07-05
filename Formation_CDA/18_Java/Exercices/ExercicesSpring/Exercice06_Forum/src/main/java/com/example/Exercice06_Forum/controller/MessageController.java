package com.example.Exercice06_Forum.controller;

import com.example.Exercice06_Forum.entity.Message;
import com.example.Exercice06_Forum.service.MessageService;
import com.example.Exercice06_Forum.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class MessageController {
    private final MessageService messageService;
    private final TopicService topicService;

    public MessageController(MessageService messageService, TopicService topicService) {
        this.messageService = messageService;
        this.topicService = topicService;
    }

    @GetMapping("/messageList/{id}")
    public String getAllMessages(Model model){
        model.addAttribute("messages", messageService.getAllMessages());
        return "message-list";
    }

    @GetMapping("/messageForm")
    public String messageForm(Model model){
        model.addAttribute("message", new Message());
        return "message-form";
    }


/*    @PostMapping("/addMessage")
    public String addMessage(@ModelAttribute("message") Message message){
        messageService.saveMessage(message);
        return "redirect:/messageList";
    }*/

    @PostMapping("/addMessage")
    public String addMessage(@ModelAttribute("message") Message message, @ModelAttribute("topicId") int topicId) {
        topicService.getTopicById(topicId);
        messageService.saveMessage(message, topicId);
        return "redirect:/messageList/{topicId}";
    }
}