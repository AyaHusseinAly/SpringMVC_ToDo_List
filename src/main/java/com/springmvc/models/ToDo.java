package com.springmvc.models;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ToDo {
    private Integer id;
    @NotBlank
    private String name;
    @NotBlank
    @Size(min=6, message="Too short description is not allowed")
    private String desc;
    private Boolean isCompleted = false;

    public ToDo() {
    }

    public ToDo(Integer id,
                String name,
                String desc,
                Boolean isCompleted
    ){
        setId(id);
        setName(name);
        setDesc(desc);
        setIsCompleted(isCompleted);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Boolean getIsCompleted() {
        return isCompleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setIsCompleted(Boolean completed) {
        isCompleted = completed;
    }

}
