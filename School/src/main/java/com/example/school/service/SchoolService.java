package com.example.school.service;

import com.example.school.model.School;
import com.example.school.dtos.SchoolDto;

import java.util.List;

public interface SchoolService {

    List<School> getAll();

    int saveSchool(String name, String location);

    SchoolDto load(int id);

    int updateSchool(int id,String name, String location);

    void deleteSchool(int id);


}
