package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "answers")
public class AnswersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long answer_id;
    @Column(name = "user_id")
    private String user_id;
    @Column(name="choice_id")
    private String choice_id;
    @Column(name = "survey_question_id")
    private String survey_question_id;
    @Column(name="answer_value")
    private String answer_value;
    @Column(name="date_created")
    private Date date_created;
    @Column(name="date_modified")
    private Date date_modified;


    public AnswersEntity() {
    }

    //constructors

    public AnswersEntity(Long answer_id, String user_id, String choice_id, String survey_question_id, String answer_value, Date date_created, Date date_modified) {
        this.answer_id = answer_id;
        this.user_id = user_id;
        this.choice_id = choice_id;
        this.survey_question_id = survey_question_id;
        this.answer_value = answer_value;
        this.date_created = date_created;
        this.date_modified = date_modified;
    }


    //getters and setters


    public Long getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Long answer_id) {
        this.answer_id = answer_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getChoice_id() {
        return choice_id;
    }

    public void setChoice_id(String choice_id) {
        this.choice_id = choice_id;
    }

    public String getSurvey_question_id() {
        return survey_question_id;
    }

    public void setSurvey_question_id(String survey_question_id) {
        this.survey_question_id = survey_question_id;
    }

    public String getAnswer_value() {
        return answer_value;
    }

    public void setAnswer_value(String answer_value) {
        this.answer_value = answer_value;
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
