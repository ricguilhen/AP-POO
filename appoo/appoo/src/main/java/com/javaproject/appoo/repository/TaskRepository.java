package com.javaproject.appoo.repository;

import com.javaproject.appoo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
