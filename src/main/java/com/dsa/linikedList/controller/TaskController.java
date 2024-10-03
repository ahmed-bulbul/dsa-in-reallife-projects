package com.dsa.linikedList.controller;


import com.dsa.linikedList.model.Task;
import com.dsa.linikedList.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<String> addTask(@RequestParam Long id, @RequestParam String description) {
        taskService.addTask(id, description);
        return ResponseEntity.ok("Task added successfully");
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }



}
