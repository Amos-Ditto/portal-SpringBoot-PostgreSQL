package com.school.schoolportal.repositories;

import com.school.schoolportal.models.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Courses, Long> {

}
