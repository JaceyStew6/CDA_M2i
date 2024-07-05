package com.example.recap_spring.controller;

import com.example.recap_spring.model.Dog;
import com.example.recap_spring.service.DogServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dog")
public class DogController {
    private final DogServiceImpl dogService;

    @Autowired
    public DogController(DogServiceImpl dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/list") // localhost:8080/dog/list
    public String list(Model model) {
        model.addAttribute("dogs", dogService.getAllDogs());
        return "dog-list";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("dog", new Dog());
        return "dog-form";
    }

    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("dog") Dog dog, BindingResult result) {
        if (result.hasErrors()) {
            return "dog-form";
        } else {
            if(dog.getId() != null){
                dogService.updateDog(dog, dog.getId());
            } else {
                dogService.createDog(dog);
            }
        }
        return "redirect:/dog/list";
    }

    @GetMapping("/delete") // localhost:8080/dog/delete?id=1
    public String delete(@RequestParam("id") Long id) {
        dogService.deleteDog(id);
        return "redirect:/dog/list";
    }

    @GetMapping("/update") // localhost:8080/dog/update?id=1
    public String update(@RequestParam("id") Long id, Model model) {
        model.addAttribute("dog", dogService.getDogById(id));
        return "dog-form";
    }

    @GetMapping("/detail/{dogId}") // localhost:8080/dog/detail/1
    public String detail(@PathVariable("dogId") Long id, Model model) {
        model.addAttribute("dog", dogService.getDogById(id));
        return "dog-detail";
    }
}
