package com.mytodo.app.my_todo_app.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {

    LoginAuthentication loginAuthentication;

    public LoginController(LoginAuthentication loginAuthentication) {
        this.loginAuthentication = loginAuthentication;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWelcome(@RequestParam String username,@RequestParam String password,  ModelMap model) {
        if(loginAuthentication.isUserAuth(username, password)){
            model.put("username", username);
            return "welcome";
        }
        model.put("ERROR_MESSAGE", "Username or password are invalid");
       return "login";
    }
}
