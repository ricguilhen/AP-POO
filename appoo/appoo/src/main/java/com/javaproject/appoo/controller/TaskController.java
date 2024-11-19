package com.javaproject.appoo.controller;

import com.javaproject.appoo.model.Task;
import com.javaproject.appoo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/get")
    public List<Task> getTask() {
        return taskService.getTasks();
    }

    @PostMapping("/post")
    public Task createTask(@RequestBody Task task) {
        return taskService.postTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        return taskService.deleteTask(id);
    }

    @PutMapping("/update/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task task) {
        return taskService.updateTask(task, id);
    }

    @PutMapping("/status/{id}")
    public Task updateTaskStatus(@PathVariable int id) {
        return taskService.updateTaskStatus(id);
    }

    @PutMapping("/priority/{id}")
    public Task updateTaskPriority(@PathVariable int id) {
        return taskService.updateTaskPriority(id);
    }

    @GetMapping("/get/filterstatus/{status}")
    public List<Task> getTaskByStatus(@PathVariable int status) {
        return taskService.getTaskByStatus(status);
    }

    @GetMapping("/get/filterpriority/{priority}")
    public List<Task> getTaskByPriority(@PathVariable int priority) {
        return taskService.getTaskByPriority(priority);
    }
}
