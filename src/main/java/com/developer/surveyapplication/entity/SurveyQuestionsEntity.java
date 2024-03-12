package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "survey_questions")
public class SurveyQuestionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_question_id")
    private Long survey_question_id;
    //FOREIGN KEY
    @Column(name = "survey_id")
    private Long survey_id;
    @Column(name = "question_type_id")
    private Long question_type;
    @Column(name = "question")
    private Long question;
    @Column(name="date_created")
    private Date date_created;
    @Column(name="date_modified")
    private Date date_modified;

    // Constructors


    public SurveyQuestionsEntity(Long survey_question_id, SurveysEntity survey_id, Long question_type, Long question, Date date_created, Date date_modified) {
        this.survey_question_id = survey_question_id;
        this.survey_id = survey_id.getSurvey_id();
        this.question_type = question_type;
        this.question = question;
        this.date_created = date_created;
        this.date_modified = date_modified;
    }

    public SurveyQuestionsEntity() {
    }

// getters, and setters

    public Long getSurvey_question_id() {
        return survey_question_id;
    }

    public void setSurvey_question_id(Long survey_question_id) {
        this.survey_question_id = survey_question_id;
    }

    public Long getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(Long survey_id) {
        this.survey_id = survey_id;
    }

    public Long getQuestion_type() {
        return question_type;
    }

    public void setQuestion_type(Long question_type) {
        this.question_type = question_type;
    }

    public Long getQuestion() {
        return question;
    }

    public void setQuestion(Long question) {
        this.question = question;
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
