package com.example.todolist.service;

import java.util.List;

import com.example.todolist.model.Task;

public interface TaskService {
	
	List<Task> getAllTasks();
	Task getTaskById(Long id);
	Task saveTask(Task task);
	void deleteTask(Long id);

}
