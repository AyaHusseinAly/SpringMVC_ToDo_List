package com.springmvc.services;

import com.springmvc.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ToDoService {
    public List<ToDo> todos = new ArrayList<ToDo>();
    public int count=0;
    public ToDoService() {
        todos.add(new ToDo(++count, "in28Minutes", "Learn Spring MVC",false));
        todos.add(new ToDo(++count, "in28Minutes", "Learn Struts", false));
        todos.add(new ToDo(++count, "in28Minutes", "Learn Hibernate", false));
        todos.add(new ToDo(++count, "in28Minutes", "Learn Hibernate", false));
        todos.add(new ToDo(++count, "in28Minutes", "Learn Hibernate", false));
        todos.add(new ToDo(++count, "in28Minutes", "L", false));
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void addToDo(ToDo todo){
        todos.add(todo);
    }

    public void deleteToDo(Integer id){
        for (int i = 0; i < todos.size(); i++) {
            if(todos.get(i).getId() == id) {
                todos.remove(i);
            }
        }
//        Iterator<ToDo> iterator = todos.iterator();
//        while (iterator.hasNext()) {
//            ToDo todo = iterator.next();
//            if (todo.getId() == id) {
//                iterator.remove();
//            }
//        }
    }

    public void updateToDo(int id, String name, String desc, Boolean isCompleted) {
        int i = getToDoIndex(id);
        ToDo todo = todos.get(i);
        todo.setName(name);
        todo.setDesc(desc);
        todo.setIsCompleted(isCompleted);
        todos.set(i,todo);
    }

    public ToDo getToDo(int id){
        for (int i = 0; i < todos.size(); i++) {
            if(todos.get(i).getId() == id) {
                return todos.get(i);
            }
        }
        return new ToDo();
    }

    public int getToDoIndex(int id){
        for (int i = 0; i < todos.size(); i++) {
            if(todos.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
