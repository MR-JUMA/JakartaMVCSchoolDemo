package com.example.school.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.mvc.binding.MvcBinding;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.FormParam;

@Named("school")
@RequestScoped
public class SchoolForm {

    @MvcBinding
    @NotNull
    @FormParam("name")
    private String name;

    @FormParam("location")
    private String location;

    public SchoolForm(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public SchoolForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "SchoolForm{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}


