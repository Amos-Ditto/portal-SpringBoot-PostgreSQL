package com.school.schoolportal.services;

import com.school.schoolportal.models.Lecturer;
import com.school.schoolportal.repositories.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LecturerServices {

    @Autowired
    private LecturerRepository lecturerRepository;

    public Lecturer createLecturer(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

    public List getLecturers() {
        return (List<Lecturer>) lecturerRepository.findAll();
    }
}
