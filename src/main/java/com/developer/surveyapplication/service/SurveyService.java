package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.SurveyEntity;


import java.util.List;
import java.util.Optional;

public interface SurveyService {
    List<SurveyEntity> findAllSurvey();
    Optional<SurveyEntity> findById(Long id);
    SurveyEntity saveSurvey( SurveyEntity surveyEntity);
    SurveyEntity updateSurvey(SurveyEntity surveyEntity);
    void deleteSurvey (Long id);
}
