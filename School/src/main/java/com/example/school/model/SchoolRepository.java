package com.example.school.model;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;


@Stateless
public class SchoolRepository {

    @PersistenceContext(unitName = "default")
    private EntityManager eManager;

    public School saveSchool(School school){
        eManager.persist(school);
        return school;
    }

    public List<School> getAll(){

        List<School> schools=eManager.createQuery("select o from School o ",School.class).getResultList();

        return schools;
    }

    public void deleteById(int id) {
        School school = eManager.find(School.class, id);
        eManager.remove(school);
    }

    public School loadById(int id){
        return eManager.find(School.class,id);
    }


}
