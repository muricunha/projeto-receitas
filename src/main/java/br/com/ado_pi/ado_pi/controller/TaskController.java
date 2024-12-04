package br.com.ado_pi.ado_pi.controller;

import br.com.ado_pi.ado_pi.model.TaskModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import br.com.ado_pi.ado_pi.service.TaskService;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RestController
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping("/saveTask")
    public ResponseEntity<TaskModel> addTask(@RequestBody TaskModel task) {
        TaskModel savedTask = taskService.addTask(task);
        return ResponseEntity.ok(savedTask);
    }

    @GetMapping("/getTask")
    public ResponseEntity<List<TaskModel>> getTasks() {
        List<TaskModel> tasks = taskService.findAllTasks();
        return ResponseEntity.ok(tasks);
    }
}
