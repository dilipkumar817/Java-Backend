package com.taskmanager.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanager.model.Tasks;
import com.taskmanager.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository repository;
	
	public void add(Tasks task) {
		repository.save(task);
	}
	
	public List<Tasks> getAllTasks(){
		return repository.findAll();
	}
	
	public void deleteTaskById(int id) {
		repository.deleteById(id);
	}
	
	public void editTask(Tasks task) {
		repository.save(task);
		
	}
		

}

