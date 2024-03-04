package com.developer.surveyapplication.repository;

import com.developer.surveyapplication.entity.SurveyQuestionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyQuestionsRepository extends JpaRepository<SurveyQuestionsEntity, Long> {
}
