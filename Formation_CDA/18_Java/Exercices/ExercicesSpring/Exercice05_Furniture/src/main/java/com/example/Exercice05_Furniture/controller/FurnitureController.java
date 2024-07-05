package com.example.Exercice05_Furniture.controller;

import com.example.Exercice05_Furniture.entity.Furniture;
import com.example.Exercice05_Furniture.service.FurnitureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FurnitureController {
    private final FurnitureService furnitureService;

    public FurnitureController(FurnitureService furnitureService) {
        this.furnitureService = furnitureService;

    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("furnitures", furnitureService.getAllFurniture());
        return "home";
    }

    @GetMapping("/addForm")
    public String addForm(Model model){
        model.addAttribute("furniture", new Furniture());
        return "add-furniture";
    }

    @PostMapping("/addFurniture")
    public String addFurniture(@ModelAttribute("furniture") Furniture furniture){
        furnitureService.saveFurniture(furniture);
        return "redirect:/";
    }

}

//    @GetMapping("/addForm")
//    public String addForm(Model model){
//        model.addAttribute("person", new Person());
//        return "add-person";
//    }
//
//    @PostMapping("/addPerson")
//    public String addPerson(@ModelAttribute("person") Person person){
//        personService.save(person);
//        return "redirect:/";
//    }
//}