package com.mytodo.app.my_todo_app.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todoList = new ArrayList<>();
    private static int todoCount = 0;

    public List<Todo> getTodoList() {
        return todoList;
    }

    public static int getTodoCount() {
        return todoCount;
    }

    public static void setTodoCount(int todoCount) {
        TodoService.todoCount = todoCount;
    }

    public void addTodo(String description, LocalDate localDate, boolean isDone) {
        Todo newTodo = new Todo(++todoCount, description, localDate, isDone);
        todoList.add(newTodo);
    }

    public Todo findById(int id) {
        Predicate<Todo> predicate = todo -> todo.getId() == id;
        return todoList.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todoList.add(todo);
    }

    public void deleteById(int id) {
        Predicate<Todo> predicate = todo -> todo.getId() == id;
        todoList.removeIf(predicate);
    }
}
