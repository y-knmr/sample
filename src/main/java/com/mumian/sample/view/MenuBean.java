package com.mumian.sample.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.mumian.sample.dto.Todo;
import com.mumian.sample.dto.TodoList;

@Named("menuBean")
@RequestScoped
public class MenuBean {

	private String content;

	@Inject
	TodoList todoList;
	
	List<Todo> dispTodos = new ArrayList<>();

	@PostConstruct
	public void init() {
		if (todoList.getTodoList() == null) {
			System.out.println("called Menu#init 1st");
			List<Todo> todos = new ArrayList<>();
			todoList.setTodoList(todos);
			Todo todo = new Todo(1, "なにかやる");
			dispTodos.add(todo);
			todoList.setTodoList(dispTodos);
			todoList.setNoCounter(todoList.getNoCounter() + 1);
		} else {
			dispTodos = todoList.getTodoList();
		}
	}

	public String add() {
		int no = todoList.getNoCounter() + 1;
		Todo todo = new Todo(no, content);
		todoList.getTodoList().add(todo);
		todoList.setNoCounter(no);
		
		return "/app/menu.xhtml?faces-redirect=true";
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Todo> getDispTodos() {
		return dispTodos;
	}

	public void setDispTodos(List<Todo> dispTodos) {
		this.dispTodos = dispTodos;
	}
	
	

}
