package com.developer.surveyapplication.service.impl;

import com.developer.surveyapplication.entity.SurveysEntity;
import com.developer.surveyapplication.repository.SurveysRepository;
import com.developer.surveyapplication.service.SurveysService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveysServiceImpl implements SurveysService {

    private final SurveysRepository surveysRepository
            ;

    public SurveysServiceImpl(SurveysRepository surveysRepository) {
        this.surveysRepository = surveysRepository;
    }

    @Override
    public List<SurveysEntity> findAllSurveys() {
        return surveysRepository.findAll();
    }
    @Override
    public Optional<SurveysEntity> findBy_survey_id(Long survey_id) {
        return surveysRepository.findById(survey_id);
    }

    @Override
    public SurveysEntity saveSurveys(SurveysEntity surveysEntity) {
        return surveysRepository.save(surveysEntity);
    }

    @Override
    public SurveysEntity updateSurveys(SurveysEntity surveysEntity) {
        return surveysRepository.save(surveysEntity);
    }

    @Override
    public void deleteSurveys(Long survey_id) {
        surveysRepository.deleteById(survey_id);
    }
}
