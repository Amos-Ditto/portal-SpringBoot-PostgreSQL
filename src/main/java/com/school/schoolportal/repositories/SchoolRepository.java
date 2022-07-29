package com.school.schoolportal.repositories;

import com.school.schoolportal.models.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {

}
