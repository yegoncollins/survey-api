package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.SurveysEntity;


import java.util.List;
import java.util.Optional;


public interface SurveysService {
    List<SurveysEntity> findAllSurveys();
    Optional<SurveysEntity> findBy_survey_id(Long survey_id);
    SurveysEntity saveSurveys( SurveysEntity surveysEntity);
    SurveysEntity updateSurveys(SurveysEntity surveysEntity);
    void deleteSurveys (Long survey_id);
}
