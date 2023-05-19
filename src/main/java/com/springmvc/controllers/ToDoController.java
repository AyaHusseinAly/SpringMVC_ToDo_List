package com.springmvc.controllers;

import com.springmvc.models.ToDo;
import com.springmvc.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("todos")
public class ToDoController {
    @Autowired
    ToDoService todoService;

    @RequestMapping(value="/todo-list", method= RequestMethod.GET)
    public String getToDoList(ModelMap modelMap){
        modelMap.put("todos",todoService.getTodos());
        return "todo-list";
    }

    @RequestMapping(value="/todo",method=RequestMethod.GET)
    public String deleteToDo(@RequestParam Integer id){
        todoService.deleteToDo(id);
        return "redirect:/todo-list";
    }

    @RequestMapping(value="/add-todo",method=RequestMethod.GET)
    public String addToDo(ModelMap modelMap){
        modelMap.addAttribute("todo",new ToDo());
        return "add-todo";
    }

    @RequestMapping(value="/add-todo",method=RequestMethod.POST)
    public String postToDo(ToDo todo){
        return "add-todo";
    }
}
