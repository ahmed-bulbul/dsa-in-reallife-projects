package com.dsa.linikedList.service;


import com.dsa.linikedList.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskLinkedList taskLinkedList;

    public TaskService(TaskLinkedList taskLinkedList) {
        this.taskLinkedList = taskLinkedList;
    }

    public void addTask(Long id, String description){
        Task task = new Task(id,description);
        taskLinkedList.addTask(task);
    }

    public List<Task> getAllTasks() {
        return taskLinkedList.getTasks();
    }


}
