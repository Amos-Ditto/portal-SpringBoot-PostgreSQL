package com.school.schoolportal.controllers;

import com.school.schoolportal.models.Lecturer;
import com.school.schoolportal.models.Student;
import com.school.schoolportal.services.LecturerServices;
import com.school.schoolportal.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UsersController {

    @Autowired
    private LecturerServices lecturerServices;

    @Autowired
    private StudentService studentService;

    @PostMapping({"/lecturer/create"})
    public Lecturer registerLecturer(@RequestBody Lecturer lecturer) {
        return lecturerServices.createLecturer(lecturer);
    }

    @GetMapping({"/lecturer/list"})
    public List<Lecturer> getListOfLecturers() {
        return (List<Lecturer>) lecturerServices.getLecturers();
    }

    @PostMapping({"/student/create"})
    public Student registerStudent(@RequestBody Student student) {
        return studentService.registerStudent(student);
    }

    @GetMapping({"/student/list"})
    public List<Student> getListOfStudents() {
        return studentService.getStudents();
    }
}
