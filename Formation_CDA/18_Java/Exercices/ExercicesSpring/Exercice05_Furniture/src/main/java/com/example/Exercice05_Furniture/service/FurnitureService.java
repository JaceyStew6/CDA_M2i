package com.example.Exercice05_Furniture.service;

import com.example.Exercice05_Furniture.dao.FurnitureRepository;
import com.example.Exercice05_Furniture.entity.Furniture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService implements IFurnitureService{
    private FurnitureRepository furnitureRepository;

    @Autowired
    public FurnitureService (FurnitureRepository furnitureRepository){
        this.furnitureRepository = furnitureRepository;
    }

    @Override
    public List<Furniture> getAllFurniture() {
        return furnitureRepository.findAll();
    }

    @Override
    public Furniture saveFurniture(Furniture furniture) {
        furnitureRepository.save(furniture);
        return furniture;
    }

    @Override
    public Furniture getFurnitureById(long id) {
        return furnitureRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteFurniture(Furniture furniture) {
        furnitureRepository.delete(furniture);
    }
}