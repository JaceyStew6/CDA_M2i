package org.example.exercice7.service;

import org.example.exercice7.model.Image;
import org.example.exercice7.repository.ImageRepository;

import java.time.LocalDate;
import java.util.List;

public class ImageService {

    private ImageRepository imageRepository = new ImageRepository();

    public Image add(String path, String fileName){
        Image image = new Image(path, fileName);
        return imageRepository.add(image);
    }

    public List<Image> findAll(){
        return imageRepository.findAll();
    }
}