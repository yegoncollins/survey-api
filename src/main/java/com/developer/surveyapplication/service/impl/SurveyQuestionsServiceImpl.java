package com.developer.surveyapplication.service.impl;

import com.developer.surveyapplication.entity.SurveyQuestionsEntity;
import com.developer.surveyapplication.repository.SurveyQuestionsRepository;
import com.developer.surveyapplication.service.SurveyQuestionsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyQuestionsServiceImpl implements SurveyQuestionsService {

    private final SurveyQuestionsRepository surveyQuestionsRepository
            ;

    public SurveyQuestionsServiceImpl(SurveyQuestionsRepository surveyQuestionsRepository) {
        this.surveyQuestionsRepository = surveyQuestionsRepository;
    }

    @Override
    public List<SurveyQuestionsEntity> findAllSurveyQuestions() {
        return surveyQuestionsRepository.findAll();
    }
    @Override
    public Optional<SurveyQuestionsEntity> findBy_survey_question_id(Long survey_question_id) {
        return surveyQuestionsRepository.findById(survey_question_id);
    }

    @Override
    public SurveyQuestionsEntity saveSurveyQuestions(SurveyQuestionsEntity surveyQuestionsEntity) {
        return surveyQuestionsRepository.save(surveyQuestionsEntity);
    }

    @Override
    public SurveyQuestionsEntity updateSurveyQuestions(SurveyQuestionsEntity surveyQuestionsEntity) {
        return surveyQuestionsRepository.save(surveyQuestionsEntity);
    }

    @Override
    public void deleteSurveyQuestions(Long survey_question_id) {
        surveyQuestionsRepository.deleteById(survey_question_id);
    }
}
