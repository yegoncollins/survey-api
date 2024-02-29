package com.developer.surveyapplication.repository;

import com.developer.surveyapplication.entity.SurveyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  SurveyRepository extends JpaRepository<SurveyEntity, Long> {
}
