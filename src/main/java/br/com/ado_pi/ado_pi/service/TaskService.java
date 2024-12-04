package br.com.ado_pi.ado_pi.service;

import br.com.ado_pi.ado_pi.model.TaskModel;
import org.springframework.stereotype.Service;
import br.com.ado_pi.ado_pi.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskModel addTask(TaskModel task) {
        return taskRepository.save(task);
    }

    public List<TaskModel> findAllTasks() {
        return taskRepository.findAll();
    }
}
