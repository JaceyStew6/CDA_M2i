package com.example.Exercice05_Furniture.dao;

import com.example.Exercice05_Furniture.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureRepository extends JpaRepository<Furniture, Long> {
}
