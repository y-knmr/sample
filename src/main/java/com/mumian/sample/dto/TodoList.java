package com.mumian.sample.dto;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TodoList {

	private int noCounter;
	
	private List<Todo> todoList;

	public int getNoCounter() {
		return noCounter;
	}

	public void setNoCounter(int noCounter) {
		this.noCounter = noCounter;
	}

	public List<Todo> getTodoList() {
		return todoList;
	}

	public void setTodoList(List<Todo> todoList) {
		this.todoList = todoList;
	}
	
	
	
	
}
