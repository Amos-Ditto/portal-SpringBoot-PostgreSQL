package com.school.schoolportal.repositories;

import com.school.schoolportal.models.Lecturer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LecturerRepository extends CrudRepository<Lecturer, Long> {

}
