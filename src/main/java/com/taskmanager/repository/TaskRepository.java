package com.taskmanager.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanager.model.Tasks;

public interface TaskRepository extends JpaRepository<Tasks, Integer> {

}

