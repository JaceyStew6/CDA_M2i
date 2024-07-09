package org.example.exercice2.repository;

import org.example.exercice2.entities.Director;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Integer> {
}
