package com.example.Exercice05_Furniture.service;

import com.example.Exercice05_Furniture.entity.Furniture;

import java.util.List;

public interface IFurnitureService {
    List<Furniture> getAllFurniture();
    Furniture saveFurniture(Furniture furniture);
    Furniture getFurnitureById(long id);
    void deleteFurniture(Furniture furniture);
}