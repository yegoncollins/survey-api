package com.developer.surveyapplication.repository;

import com.developer.surveyapplication.entity.SurveysEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  SurveysRepository extends JpaRepository<SurveysEntity, Long> {

}
