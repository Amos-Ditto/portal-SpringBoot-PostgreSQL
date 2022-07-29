package com.school.schoolportal.models;

import com.school.schoolportal.models.School;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "course_slug_name", nullable = false, length = 40)
    private String courseSlugName;

    @Column(name = "courseName", nullable = false, length = 40)
    private String courseName;

    @Column(name = "courseDescription", nullable = true, columnDefinition = "Text")
    private String courseDescription;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "school_department_group")
    private SchoolDepartment department;

}
