package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.SurveyQuestionsEntity;


import java.util.List;
import java.util.Optional;

public interface SurveyQuestionsService {
    List<SurveyQuestionsEntity> findAllSurveyQuestions();
    Optional<SurveyQuestionsEntity> findBy_survey_question_id(Long survey_question_id);

    SurveyQuestionsEntity saveSurveyQuestions(SurveyQuestionsEntity surveyQuestionsEntity);

    SurveyQuestionsEntity updateSurveyQuestions(SurveyQuestionsEntity surveyQuestionsEntity);

    void deleteSurveyQuestions(Long survey_question_id);
}
