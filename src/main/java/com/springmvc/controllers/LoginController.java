package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("todos")
@Controller
public class LoginController {
//    @ResponseBody
    @RequestMapping(value="/login")
    public String loginPage(){
        return "login";
        //return "<a href='/spring-mvc/todo-list'>go to todo list</a>";
    }

}
