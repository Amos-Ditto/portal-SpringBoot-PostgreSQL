package com.school.schoolportal.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "school_department")
@AllArgsConstructor
@NoArgsConstructor
public class SchoolDepartment {

    @Id
    @SequenceGenerator(name = "department_sequence", sequenceName = "department_sequence",
        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_sequence")
    private Long departmentID;

    @Column(name = "department", nullable = false, length = 100, unique = true)
    private String departmentName;

    @ManyToOne(targetEntity = School.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "schoolID", nullable = false, referencedColumnName = "schoolID")
    private School school;
}
