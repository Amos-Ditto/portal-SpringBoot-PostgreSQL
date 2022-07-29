package com.school.schoolportal.services;


import com.school.schoolportal.models.Student;
import com.school.schoolportal.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(Student student) {
        return studentRepository.save(student);
    }
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }
}
