package com.mytodo.app.my_todo_app.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.time.LocalDate;
import java.util.List;

@Controller
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "todo-list", method = RequestMethod.GET)
    public String goToTodoList(ModelMap model) {
        List<Todo> allTodosList = todoService.getTodoList();
        model.put("allTodosList", allTodosList);
        return "todo-list";
    }

    @RequestMapping(value = "todo", method = RequestMethod.GET)
    public String goToAddTodo(ModelMap model) {
        Todo todo = new Todo(0, "", LocalDate.now().plusYears(1), false);
        model.addAttribute("todo", todo);
        return "todo";
    }


    @RequestMapping(value = "todo", method = RequestMethod.POST)
    public String addNewTodo(@Valid Todo todo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "todo";
        }
        todoService.addTodo(todo.getDescription(), todo.getLocalDate(), false);
        return "redirect:todo-list";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String goToUpdate(@RequestParam int id, ModelMap map) {
        Todo todo = todoService.findById(id);
        map.addAttribute("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(Todo todo) {
        todoService.updateTodo(todo);
        return "redirect:todo-list";
    }

    @RequestMapping(value = "delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteById(id);
        return "redirect:todo-list";
    }
}
