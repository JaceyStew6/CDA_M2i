package com.example.exercice_01.service;

import com.example.exercice_01.model.Todo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Getter
@Setter
public class TodoService {
    private ArrayList<Todo> todos = new ArrayList<>();

    public TodoService(){
        this.todos.add(new Todo("test1", "description1", true));
        this.todos.add(new Todo("test2", "description2", false));
        this.todos.add(new Todo("test3", "description3", true));
    }
}
