package com.asplett.todoapi.service;

import com.asplett.todoapi.api.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private List<Task> tasks;

    public TaskService(){
        this.tasks = new ArrayList<>();
        Task tk1 = new Task("teste1", "teste1", false);
        Task tk2 = new Task("teste2", "teste2", false);
        Task tk3 = new Task("teste3", "teste3", false);
        tasks.add(tk1);
        tasks.add(tk2);
        tasks.add(tk3);
    }

    //including the option case it doesn't find the desired task
    public Optional<Task> getTaskById(String id){
        Optional<Task> task = Optional.empty();
        for(Task t : tasks){
            if(t.getId().equals(id)){
                task = Optional.of(t);
                return task;
            }
        }
        return task;
    }

    public List<Task> getAllTasks(){
        return tasks;
    }
}
