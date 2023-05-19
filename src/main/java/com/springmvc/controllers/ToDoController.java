package com.springmvc.controllers;

import com.springmvc.models.ToDo;
import com.springmvc.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
        return "redirect:todo-list";
    }

    @RequestMapping(value="/add-todo",method=RequestMethod.GET)
    public String addToDo(ModelMap modelMap){
        modelMap.addAttribute("todo",new ToDo());
        return "add-todo";
    }

    @RequestMapping(value="/add-todo",method=RequestMethod.POST)
    public String postToDo(@ModelAttribute("todo") @Valid ToDo todo, BindingResult result){
        if(result.hasErrors()) {
            return "add-todo";
        }
        todo.setId(++todoService.count);
        todoService.addToDo(todo);
        return "redirect:todo-list";


    }

    @RequestMapping(value="/update-todo",method=RequestMethod.GET)
    public String updateToDo(ModelMap modelMap, @RequestParam int id){
        modelMap.addAttribute("todo",todoService.getToDo(id));
        return "update-todo";
    }

    @RequestMapping(value="/update-todo",method=RequestMethod.POST)
    public String putToDo(@ModelAttribute("todo") @Valid ToDo todo, BindingResult result){
        if(result.hasErrors()) {
            return "update-todo";
        }
        todoService.updateToDo(todo.getId(), todo.getName(), todo.getDesc(), todo.getIsCompleted());
        return "redirect:todo-list";


    }
}
