package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "responses")
public class ResponseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "response_id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name="response1")
    private String response1;
    @Column(name = "response2")
    private String response2;
    @Column(name = "response2_optionA")
    private String response2OptionA;
    @Column(name = "response2_optionB")
    private String response2OptionB;
    @Column(name = "response2_optionC")
    private String response2OptionC;
    @Column(name="response3")
    private String response3;
    @Column(name = "response4")
    private String response4;
    @Column(name = "response5")
    private String response5;
    @Column(name="response6")
    private String response6;
    @Column(name="response7_file_reference")
    private String response7FileReference;

    public ResponseEntity() {
    }

    //constructors

    public ResponseEntity(Long id, String title, String response1, String response2, String response2OptionA, String response2OptionB, String response2OptionC, String response3, String response4, String response5, String response6, String response7FileReference) {
        this.id = id;
        this.title = title;
        this.response1 = response1;
        this.response2 = response2;
        this.response2OptionA = response2OptionA;
        this.response2OptionB = response2OptionB;
        this.response2OptionC = response2OptionC;
        this.response3 = response3;
        this.response4 = response4;
        this.response5 = response5;
        this.response6 = response6;
        this.response7FileReference = response7FileReference;
    }

    //getters and setters


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

    public String getResponse1() {
        return response1;
    }

    public void setResponse1(String response1) {
        this.response1 = response1;
    }

    public String getResponse2() {
        return response2;
    }

    public void setResponse2(String response2) {
        this.response2 = response2;
    }

    public String getResponse2OptionA() {
        return response2OptionA;
    }

    public void setResponse2OptionA(String response2OptionA) {
        this.response2OptionA = response2OptionA;
    }

    public String getResponse2OptionB() {
        return response2OptionB;
    }

    public void setResponse2OptionB(String response2OptionB) {
        this.response2OptionB = response2OptionB;
    }

    public String getResponse2OptionC() {
        return response2OptionC;
    }

    public void setResponse2OptionC(String response2OptionC) {
        this.response2OptionC = response2OptionC;
    }

    public String getResponse3() {
        return response3;
    }

    public void setResponse3(String response3) {
        this.response3 = response3;
    }

    public String getResponse4() {
        return response4;
    }

    public void setResponse4(String response4) {
        this.response4 = response4;
    }

    public String getResponse5() {
        return response5;
    }

    public void setResponse5(String response5) {
        this.response5 = response5;
    }

    public String getResponse6() {
        return response6;
    }

    public void setResponse6(String response6) {
        this.response6 = response6;
    }

    public String getResponse7FileReference() {
        return response7FileReference;
    }

    public void setResponse7FileReference(String response7FileReference) {
        this.response7FileReference = response7FileReference;
    }
}
