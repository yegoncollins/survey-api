package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "surveys")
public class SurveysEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "surveys_id")
    private Long survey_id;
    @Column(name = "user_id")
    private String user_id;
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

    public SurveysEntity(Long survey_id, String user_id, String survey_name, String description, Date date_created, Date date_modified) {
        this.survey_id = survey_id;
        this.user_id = user_id;
        this.survey_name = survey_name;
        this.description = description;
        this.date_created = date_created;
        this.date_modified = date_modified;
    }

    public Long getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(Long survey_id) {
        this.survey_id = survey_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public void setDate_reated(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }
}
