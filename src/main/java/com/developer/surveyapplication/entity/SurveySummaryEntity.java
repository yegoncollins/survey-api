package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "survey/summary")
public class SurveySummaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_summary_id")
    private Long survey_summary_id;
    @Column(name = "survey_id")
    private Long survey_id;
    @Column(name="number_of_questions")
    private Integer number_of_questions;
    @Column(name="number_of_responses")
    private Integer number_of_responses;
    @Column(name="number_of_pages")
    private Integer number_of_pages;
    @Column(name="date_created")
    private Date date_created;
    @Column(name="date_modified")
    private Date date_modified;

    public SurveySummaryEntity() {
    }

    public SurveySummaryEntity(Long survey_summary_id, Long survey_id, Integer number_of_questions, Integer number_of_responses, Integer number_of_pages, Date date_created, Date date_modified) {
        this.survey_summary_id = survey_summary_id;
        this.survey_id = survey_id;
        this.number_of_questions = number_of_questions;
        this.number_of_responses = number_of_responses;
        this.number_of_pages = number_of_pages;
        this.date_created = date_created;
        this.date_modified = date_modified;
    }

    public Long getSurvey_summary_id() {
        return survey_summary_id;
    }

    public void setSurvey_summary_id(Long survey_summary_id) {
        this.survey_summary_id = survey_summary_id;
    }

    public Long getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(Long survey_id) {
        this.survey_id = survey_id;
    }

    public Integer getNumber_of_questions() {
        return number_of_questions;
    }

    public void setNumber_of_questions(Integer number_of_questions) {
        this.number_of_questions = number_of_questions;
    }

    public Integer getNumber_of_responses() {
        return number_of_responses;
    }

    public void setNumber_of_responses(Integer number_of_responses) {
        this.number_of_responses = number_of_responses;
    }

    public Integer getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(Integer number_of_pages) {
        this.number_of_pages = number_of_pages;
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
