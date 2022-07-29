package com.school.schoolportal.repositories;

import com.school.schoolportal.models.SchoolDepartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<SchoolDepartment, Long> {

}
