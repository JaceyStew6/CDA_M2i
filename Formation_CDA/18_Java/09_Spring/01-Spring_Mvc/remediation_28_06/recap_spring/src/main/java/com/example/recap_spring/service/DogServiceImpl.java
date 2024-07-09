package com.example.recap_spring.service;

import com.example.recap_spring.model.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogServiceImpl implements IDogService{
    List<Dog> dogs = new ArrayList<Dog>();
    Long counter = 1L;

    public DogServiceImpl() {
        Dog dog = Dog.builder()
                .id(counter++)
                .name("Rex")
                .age(10)
                .breed("Berger Allemand")
                .build();

        dogs.add(dog);
    }

    @Override
    public Dog createDog(Dog dog) {
        dog.setId(counter++);
        dogs.add(dog);
        return dog;
    }

    @Override
    public Dog getDogById(Long id) {
        return dogs.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Dog> getAllDogs() {
        return dogs;
    }

    @Override
    public Dog updateDog(Dog dog, Long id) {
        Dog dogExist = getDogById(id);
        if (dogExist != null) {
            dogExist.setName(dog.getName());
            dogExist.setAge(dog.getAge());
            dogExist.setBreed(dog.getBreed());
        }
        return dogExist;
    }

    @Override
    public void deleteDog(Long id) {
        dogs.removeIf(dog -> dog.getId().equals(id));
    }
}
