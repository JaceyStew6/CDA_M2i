package com.example.Exercice06_Forum.controller;

import com.example.Exercice06_Forum.entity.Message;
import com.example.Exercice06_Forum.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;

@Controller
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
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

    @PostMapping("/addMessage")
    public String addMessage(@ModelAttribute("message") Message message){
        messageService.saveMessage(message);
        return "redirect:/messageList";
    }
}