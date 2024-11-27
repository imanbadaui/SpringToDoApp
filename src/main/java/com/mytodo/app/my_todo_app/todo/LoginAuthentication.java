package com.mytodo.app.my_todo_app.todo;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthentication {


    public boolean isUserAuth(String username, String password){
      boolean isUsername =  username.equalsIgnoreCase("emma");
      boolean isPassword = password.equalsIgnoreCase("dummy");
      return  isUsername && isPassword;
    }

}
