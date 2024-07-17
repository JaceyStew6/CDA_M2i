package org.example.tpspringsecuritytodolist.controller;

import org.example.tpspringsecuritytodolist.entity.Todo;
import org.example.tpspringsecuritytodolist.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private ITodoService todoService; //Toujours injecter l'interface pour avoir un couplage faible (rendre moins dépendantes les couches de l'application)

    //Role ADMIN
    @PostMapping("/admin/post")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo){
        return ResponseEntity.ok(todoService.saveTodo(todo));
    }

    @GetMapping("/admin/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id){
        Optional<Todo> todo = todoService.getTodoById(id);
        return todo.map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build());
    }

    @PutMapping("/admin/update")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo){
        return ResponseEntity.ok(todoService.updateTodo(todo));
    }

    @DeleteMapping("/admin/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
        return ResponseEntity.ok().build();
    }

    //----------------------------
    //Roles USER && ADMIN
    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos(){
        return ResponseEntity.ok(todoService.getAllTodos());
    }
}
