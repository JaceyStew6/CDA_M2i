package org.example.tpspringsecuritytodolist.repository;

import org.example.tpspringsecuritytodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
