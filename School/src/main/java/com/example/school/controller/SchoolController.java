package com.example.school.controller;

import com.example.school.model.School;
import com.example.school.dtos.SchoolDto;
import com.example.school.service.SchoolService;
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
    private SchoolService schoolService;

    @GET
    @Path("add")
    public String addForm(){
        return "homepage.jsp";
    }



    @GET
    public String home() {

        List<School> list= schoolService.getAll();

        model.put("list",list);
        return "view.jsp";
    }

    @POST
    @Path("save")
    public Response save(@BeanParam SchoolForm form){
        schoolService.saveSchool(form.getName(),form.getLocation());
        return Response.ok("redirect:school").build();
    }


    @GET
    @Path("{id}/edit")
    public String edit(@PathParam("id") int id){
        SchoolDto dto= schoolService.load(id);
        SchoolForm form=new SchoolForm();
        form.setId(dto.getId());
        form.setName(dto.getName());
        form.setLocation(dto.getLocation());
        model.put("form",form);
        return "details.jsp";
    }

    @POST
    @Path("{id}/update")
    public Response update(@PathParam("id") int id,@BeanParam SchoolForm form){
        schoolService.updateSchool(id,form.getName(),form.getLocation());
        return Response.ok("redirect:school").build();
    }


    @POST
    @Path("{id}/delete")
    public Response deleteSchool(@PathParam("id") int id){
        schoolService.deleteSchool(id);
        return Response.ok("redirect:school").build();
    }


}

