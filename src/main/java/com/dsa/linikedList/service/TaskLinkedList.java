package com.dsa.linikedList.service;

import com.dsa.linikedList.model.Task;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class TaskLinkedList {
    private Node head;
    class Node{
        private Task task;
        private Node next;

        public Node(Task task){
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task){
        Node newNode = new Node(task);

        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while (current.next !=null){
                current = current.next;
            }

            current.next = newNode;
        }
    }

    //get all task
    public List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        Node current = head;
        while (current!=null){
            tasks.add(current.task);
            current = current.next;
        }

        return tasks;
    }

    public void removeTask(Long id) {
        if (head == null) return;
        if (head.task.getId().equals(id)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.task.getId().equals(id)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}
