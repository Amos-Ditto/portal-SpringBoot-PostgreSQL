package com.school.schoolportal.controllers;

import com.school.schoolportal.models.School;
import com.school.schoolportal.models.SchoolDepartment;
import com.school.schoolportal.services.DepartmentServices;
import com.school.schoolportal.services.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeneralController {
    @Autowired
    private SchoolServices schoolServices;

    @Autowired
    private DepartmentServices departmentServices;

    @PostMapping({"/school/create"})
    public School createSchools(@RequestBody School school) {
        return schoolServices.createSchool(school);
    }

    @GetMapping({"/school/list"})
    public List<School> getSchools() {
        return (List<School>) schoolServices.getSchools();
    }

    @PostMapping({"/school/createDepartment"})
    public SchoolDepartment createSchoolDepartment(@RequestBody SchoolDepartment schoolDepartment) {
        return departmentServices.createDepartment(schoolDepartment);
    }
    @GetMapping({"/school/departmentList"})
    public List<SchoolDepartment> getDepartmentList() {
        return departmentServices.getDepartmentList();
    }
}
