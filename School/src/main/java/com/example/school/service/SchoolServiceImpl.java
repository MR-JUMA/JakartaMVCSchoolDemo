package com.example.school.service;

import com.example.school.model.School;
import com.example.school.repository.SchoolRepository;
import com.example.school.dtos.SchoolDto;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.util.List;

@Stateless
public class SchoolServiceImpl implements SchoolService{

    @Inject
    private SchoolRepository schoolRepository;

    @Override
    public List<School> getAll() {
        return  schoolRepository.getAll();

    }

    @Override
    public int saveSchool(String name, String location) {
        School school=new School();
        school.setName(name);
        school.setLocation(location);
        schoolRepository.saveSchool(school);
        return school.getId();
    }

    @Override
    public SchoolDto load(int id) {
        School school=schoolRepository.loadById(id);
        SchoolDto dto=new SchoolDto();
        dto.setId(school.getId());
        dto.setName(school.getName());
        dto.setLocation(school.getLocation());
        return dto;
    }

    @Override
    public int updateSchool(int id, String name, String location) {

        School school=schoolRepository.loadById(id);
        school.setName(name);
        school.setLocation(location);
        schoolRepository.update(school);
        return school.getId();
    }

    @Override
    public void deleteSchool(int id) {
        schoolRepository.deleteById(id);
    }

}
