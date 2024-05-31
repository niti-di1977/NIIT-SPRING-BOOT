package com.example.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.todolist.model.Task;
import com.example.todolist.service.TaskServiceImpl;

@Controller
public class TaskController {

	@Autowired
	private TaskServiceImpl serviceimpl;
	
	@GetMapping("/")
	public String index(Model model)
	{
		
		model.addAttribute("task", serviceimpl.getAllTasks());
		return "index";
	}
	
	@GetMapping("/add")
	public String addTaskForm(Model model)
	{
		
		model.addAttribute("task", new Task());
		System.out.println("Task Added");
		return "add";
	}
	
	@PostMapping("/save")
	public String saveTask(@ModelAttribute Task task)
	{
		
		serviceimpl.saveTask(task);
		return "redirect:/";
	}
	
}
