package com.example.todolist.reepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todolist.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task , Long>{

}
