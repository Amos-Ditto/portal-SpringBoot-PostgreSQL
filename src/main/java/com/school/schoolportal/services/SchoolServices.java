package com.school.schoolportal.services;

import com.school.schoolportal.models.School;
import com.school.schoolportal.repositories.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServices {

    @Autowired
    private SchoolRepository schoolRepository;

    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    public List<School> getSchools() {
        return (List<School>) schoolRepository.findAll();
    }
}
