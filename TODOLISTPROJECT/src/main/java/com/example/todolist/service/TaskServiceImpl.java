package com.example.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist.model.Task;
import com.example.todolist.reepository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

	
	@Autowired
	TaskRepository taskRepo;

	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskRepo.findAll();
	}

	@Override
	public Task getTaskById(Long id) {
		// TODO Auto-generated method stub
		return taskRepo.findById(id).orElse(null);
	}

	@Override
	public Task saveTask(Task task) {
		// TODO Auto-generated method stub
		return taskRepo.save(task);
	}

	@Override
	public void deleteTask(Long id) {
		// TODO Auto-generated method stub
		 taskRepo.deleteById(id);
	}
	
	
}
