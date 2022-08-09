package com.school.schoolportal.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "school_department")
@NoArgsConstructor
public class SchoolDepartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentID;

    @Column(name = "department", nullable = false, length = 100)
    private String departmentName;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "schoolID", nullable = false)
    private School school;
}
