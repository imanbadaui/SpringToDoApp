package com.mytodo.app.my_todo_app.login;

import com.mytodo.app.my_todo_app.todo.Todo;
import com.mytodo.app.my_todo_app.todo.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("username")
public class LoginController {

    TodoService todoService;

    public LoginController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcome(@RequestParam String username, ModelMap model) {
        model.put("username", username);
        return "welcome";
    }

    @RequestMapping(value = "todo-list", method = RequestMethod.GET)
    public String goToTodoList(ModelMap model){
        List<Todo> allTodosList = todoService.getTodoList();
        model.put("allTodosList", allTodosList);
        return "todo-list";
    }

    /*
    @RequestMapping(value = "todo-list", method = RequestMethod.POST)
    public String goToTodoList(@RequestParam String description, @RequestParam LocalDate date
            , @RequestParam boolean isDone, ModelMap model) {
        todoService.addTodo(description, date, isDone);
        return "todo-list";
    } */
}
