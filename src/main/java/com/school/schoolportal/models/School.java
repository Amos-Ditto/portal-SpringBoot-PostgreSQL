package com.school.schoolportal.models;


import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "School")
@NoArgsConstructor
public class School {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long schoolID;
    @Column(name = "school_name", length = 50, unique = true)
    private String schoolName;

    @Column(nullable = true, columnDefinition = "TEXT")
    private String schoolDescription;

    public Long getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(Long schoolID) {
        this.schoolID = schoolID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
