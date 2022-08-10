package com.school.schoolportal.repositories;

import com.school.schoolportal.models.SchoolDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<SchoolDepartment, Long> {

}
