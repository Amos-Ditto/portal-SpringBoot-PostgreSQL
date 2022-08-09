package com.school.schoolportal.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long studentID;

    @Column(name = "registration_number", nullable = false)
    private String regNumber;

    @Column(name = "student_first_name", nullable = false)
    private String firstName;
    @Column(name = "student_last_name", nullable = false)
    private String lastName;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "department_ID")
    private SchoolDepartment schoolDepartments;

    private Date dateJoined;
}
