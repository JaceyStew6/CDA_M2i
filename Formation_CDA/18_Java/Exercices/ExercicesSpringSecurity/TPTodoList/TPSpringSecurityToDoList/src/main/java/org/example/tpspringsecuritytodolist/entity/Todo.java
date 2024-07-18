package org.example.tpspringsecuritytodolist.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean isCompleted;
}