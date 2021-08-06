package com.example.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ToDoService {

	public List<ToDo> findAll() {
	    return new ArrayList<>();
	}
}
