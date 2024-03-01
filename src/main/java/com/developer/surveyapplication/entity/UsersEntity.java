package com.developer.surveyapplication.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "survey_user")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name="user_id")
    private Long id;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="age")
    private Integer age;
    @Column(name="county")
    private String county;
    @Column(name="roles")
    private String roles;
    @Column(name="password")
    private String password;

    @Column(name="date_created")
    private Date dateCreated;

    @Column(name="date_modified")
    private Date dateModified;

// constructors


    public UsersEntity(Long id, String firstName, String lastName, String email, Integer age, String county, String roles, String password, Date dateCreated, Date dateModified) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.county = county;
        this.roles = roles;
        this.password = password;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public UsersEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

}
