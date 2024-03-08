package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "surveys")
public class SurveysEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "surveys_id")
    private long survey_id;

    // FOREIGN KEY
    @Column(name = "user_id")
    private Long userId;

    @Column(name="survey_name")
    private String survey_name;
    @Column(name="description")
    private String description;
    @Column(name="date_created")
    private Date date_created;
    @Column(name="date_modified")
    private Date date_modified;

    public SurveysEntity() {
    }

    public SurveysEntity(long survey_id, UsersEntity userId, String survey_name, String description, Date date_created, Date date_modified) {
        this.survey_id = survey_id;
        this.userId = userId.getUser_id();
        this.survey_name = survey_name;
        this.description = description;
        this.date_created = date_created;
        this.date_modified = date_modified;
    }

    public long getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(long survey_id) {
        this.survey_id = survey_id;
    }

    public Long getUser_id() {
        return userId;
    }

    public void setUser_id(Long userId) {
        this.userId = userId;
    }

    public String getSurvey_name() {
        return survey_name;
    }

    public void setSurvey_name(String survey_name) {
        this.survey_name = survey_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }
}
