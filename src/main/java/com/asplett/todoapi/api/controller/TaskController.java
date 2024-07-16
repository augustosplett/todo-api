package com.asplett.todoapi.api.controller;

import com.asplett.todoapi.api.dto.TaskRequest;
import com.asplett.todoapi.api.model.Task;
import com.asplett.todoapi.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/task")
    public Task GetTask(@RequestParam String id){
        Optional<Task> task = taskService.getTaskById(id);
        return task.orElse(null);
    }
    @GetMapping("/tasks")
    public List<Task> GetAllTasks(){
        return taskService.getAllTasks();
    }
    @PostMapping("/tasks")
    public Task createTask(@RequestBody TaskRequest taskRequest) {
        // Convert TaskRequest to Task
        Task task = new Task(taskRequest.getTitle(), taskRequest.getDescription(), taskRequest.isDone());
        //save task
        taskService.AddTask(task);
        return task;
    }
    @DeleteMapping("/tasks")
    public void deleteTask(@RequestParam String id) {
        taskService.DeleteTask(id);
    }
    @PutMapping("/tasks")
    public void updateTask(@RequestBody Task taskRequest) {
        Task task = new Task(taskRequest.getId(), taskRequest.getTitle(), taskRequest.getDescription(), taskRequest.isDone());
        taskService.UpdateTask(task);
    }
}
