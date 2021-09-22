package com.example.school.controller;

import com.example.school.model.School;
import com.example.school.model.SchoolRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.mvc.Models;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Controller
@Path("school")
@RequestScoped
public class SchoolController {

    @Inject
    Models model;
    @Inject
    SchoolRepository schoolRepository;

    @GET
    @Path("add")
    public String addForm(){
        return "homepage.jsp";
    }

    @GET
    @Path("{id}")
    public String edit(@PathParam("id") int id){
        School school=schoolRepository.loadById(id);
        model.put("school",school);
        return "details.jsp";
    }

    @GET
    public String home() {

        List<School> list= schoolRepository.getAll();
        model.put("list",list);
        return "view.jsp";
    }

    @POST
    @Path("save")
    public Response save(@BeanParam SchoolForm form){

        School school=new School();
        school.setName(form.getName());
        school.setLocation(form.getLocation());
        schoolRepository.saveSchool(school);
        return Response.ok("redirect:school").build();
    }



    @POST
    @Path("{id}")
    public Response deleteSchool(@PathParam("id") int id){
        schoolRepository.deleteById(id);
        return Response.ok("redirect:school").build();
    }


}

