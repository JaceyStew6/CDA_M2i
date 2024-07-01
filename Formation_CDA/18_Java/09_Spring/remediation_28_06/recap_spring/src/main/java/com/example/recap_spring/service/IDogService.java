package com.example.recap_spring.service;

import com.example.recap_spring.model.Dog;

import java.util.List;

public interface IDogService {
    Dog createDog(Dog dog);
    Dog getDogById(Long id);
    List<Dog> getAllDogs();
    Dog updateDog(Dog dog, Long id);
    void deleteDog(Long id);
}
