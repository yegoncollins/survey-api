package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "choices")
public class ChoicesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "choice_id")
    private Long choice_id;
    @Column(name = "survey_question_id")
    private String survey_question_id;
    @Column(name="choice_option")
    private String choice_option;
    @Column(name="choice_value")
    private String choice_value;
    @Column(name="date_created")
    private Date date_created;
    @Column(name="date_modified")
    private Date date_modified;

    public ChoicesEntity() {
    }

    public ChoicesEntity(Long choice_id, String survey_question_id, String choice_option, String choice_value, Date date_created, Date date_modified) {
        this.choice_id = choice_id;
        this.survey_question_id = survey_question_id;
        this.choice_option = choice_option;
        this.choice_value = choice_value;
        this.date_created = date_created;
        this.date_modified = date_modified;
    }

    public Long getChoice_id() {
        return choice_id;
    }

    public void setId(Long choice_id) {
        this.choice_id = choice_id;
    }

    public String getSurvey_question_id() {
        return survey_question_id;
    }

    public void setSurvey_question_id(String survey_question_id) {
        this.survey_question_id = survey_question_id;
    }

    public String getChoice_option() {
        return choice_option;
    }

    public void setChoice_option(String choice_option) {
        this.choice_option = choice_option;
    }

    public String getChoice_value() {
        return choice_value;
    }

    public void setChoice_value(String choice_value) {
        this.choice_value = choice_value;
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
