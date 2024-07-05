package com.example.Exercice06_Forum.controller;

import com.example.Exercice06_Forum.entity.Topic;
import com.example.Exercice06_Forum.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TopicController {
    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/topicList")
    public String getAllTopics(Model model){
        model.addAttribute("topics", topicService.getAllTopics());
        return "topic-list";
    }

    @GetMapping("/topicForm")
    public String topicForm(Model model){
        model.addAttribute("topic", new Topic());
        return "topic-form";
    }

    @PostMapping("/addTopic")
    public String addTopic(@ModelAttribute("topic") Topic topic){
        topicService.saveTopic(topic);
        return "redirect:/topicList";
    }

}
