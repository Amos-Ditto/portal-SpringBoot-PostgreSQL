package com.school.schoolportal.models;


import javax.persistence.*;

@Entity
@Table(name = "School")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long schoolID;
    @Column(name = "school_name", length = 50)
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
