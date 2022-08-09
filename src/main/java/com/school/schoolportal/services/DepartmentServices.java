package com.school.schoolportal.services;

import com.school.schoolportal.models.SchoolDepartment;
import com.school.schoolportal.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServices {

    @Autowired
    private DepartmentRepository departmentRepository;

    public SchoolDepartment createDepartment(SchoolDepartment schoolDepartment) {
        return departmentRepository.save(schoolDepartment);
    }

    public List<SchoolDepartment> getDepartmentList() {
        return (List<SchoolDepartment>) departmentRepository.findAll();
    }
}
