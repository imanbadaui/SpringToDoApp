package com.mytodo.app.my_todo_app.todo;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();
    private static int todoCount = 0;

    public void addTodo(String description, LocalDate localDate, boolean isDone){
        Todo newTodo = new Todo(++todoCount, description, localDate, isDone);
        todoList.add(newTodo);
    }

static {
    todoList.add(new Todo(++todoCount, "Learn Fashion", LocalDate.now().plusYears(1), false));
    todoList.add(new Todo(++todoCount, "Learn makeup", LocalDate.now().plusYears(2), false));
    todoList.add(new Todo(++todoCount, "Learn Music", LocalDate.now().plusYears(1), false));
    todoList.add(new Todo(++todoCount, "Learn Etiquette", LocalDate.now().plusYears(3), false));
}
    public List<Todo> getTodoList() {
        return todoList;
    }
}
