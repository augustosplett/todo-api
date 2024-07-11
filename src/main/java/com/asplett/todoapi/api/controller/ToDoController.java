package com.asplett.todoapi.api.controller;

import com.asplett.todoapi.api.model.Task;
import com.asplett.todoapi.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ToDoController {

    private final TaskService taskService;

    public ToDoController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/user")
    public Task GetTask(@RequestParam String id){
        Optional<Task> task = taskService.getTaskById(id);
        return (Task) task.orElse(null);
    }

    @GetMapping("/users")
    public List<Task> GetAllTasks(){
        return taskService.getAllTasks();
    }
}
