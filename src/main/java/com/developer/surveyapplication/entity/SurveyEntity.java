package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "survey")
public class SurveyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_id")
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name="question1")
    private String question1;
    @Column(name = "question2")
    private String question2;
    @Column(name = "question2_optionA")
    private String question2OptionA;
    @Column(name = "question2_optionB")
    private String question2OptionB;
    @Column(name = "question2_optionC")
    private String question2OptionC;
    @Column(name="question3")
    private String question3;
    @Column(name = "question4")
    private String question4;
    @Column(name = "question5")
    private String question5;
    @Column(name="question6")
    private String question6;
    @Column(name="question7_file_reference")
    private String question7FileReference;

    // Constructors


    public SurveyEntity(Long id, String title, String question1, String question2, String question2OptionA, String question2OptionB, String question2OptionC, String question3, String question4, String question5, String question6, String question7FileReference) {
        this.id = id;
        this.title = title;
        this.question1 = question1;
        this.question2 = question2;
        this.question2OptionA = question2OptionA;
        this.question2OptionB = question2OptionB;
        this.question2OptionC = question2OptionC;
        this.question3 = question3;
        this.question4 = question4;
        this.question5 = question5;
        this.question6 = question6;
        this.question7FileReference = question7FileReference;
    }

    public SurveyEntity() {
    }

// getters, and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion2OptionA() {
        return question2OptionA;
    }

    public void setQuestion2OptionA(String question2OptionA) {
        this.question2OptionA = question2OptionA;
    }

    public String getQuestion2OptionB() {
        return question2OptionB;
    }

    public void setQuestion2OptionB(String question2OptionB) {
        this.question2OptionB = question2OptionB;
    }

    public String getQuestion2OptionC() {
        return question2OptionC;
    }

    public void setQuestion2OptionC(String question2OptionC) {
        this.question2OptionC = question2OptionC;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public void setQuestion6(String question6) {
        this.question6 = question6;
    }
    public String getQuestion7FileReference() {
        return question7FileReference;
    }

    public void setQuestion7FileReference(String question7FileReference) {
        this.question7FileReference = question7FileReference;
    }
}
