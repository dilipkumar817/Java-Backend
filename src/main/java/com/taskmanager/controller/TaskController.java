package com.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.taskmanager.model.Tasks;
import com.taskmanager.repository.TaskRepository;
import com.taskmanager.service.TaskService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TaskController {
	
	@Autowired
	TaskService taskService;
	@Autowired
	TaskRepository repository;
	
	@PostMapping("/addtask")
	public String addTask(@RequestParam String trainingName, @RequestParam String trainingStartDate,@RequestParam  String trainingEndDate,@RequestParam  String completionStatus) {
		Tasks task = new Tasks(0,trainingName,trainingStartDate,trainingEndDate,completionStatus);
		taskService.add(task);
		return "Task added successfully";
	}
	
	@GetMapping("/getalltasks")
	public List<Tasks> getAll(){
		return taskService.getAllTasks();
	}
	
	@DeleteMapping("/deletebytaskid")
	public String deleteById(int id) {
		taskService.deleteTaskById(id);
		return "task has been deleted successfully";
	}
	
	@PutMapping("/edittask")
	public String editTasks(int id, String trainingName, String trainingStartDate, String trainingEndDate, String completionStatus) {
		Tasks task = new Tasks(id, trainingName, trainingStartDate, trainingEndDate, completionStatus);
		taskService.editTask(task);
		return "Task has been updated successfully";
	
	}

}

