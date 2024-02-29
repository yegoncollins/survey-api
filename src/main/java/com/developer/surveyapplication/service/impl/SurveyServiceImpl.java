package com.developer.surveyapplication.service.impl;

import com.developer.surveyapplication.entity.SurveyEntity;
import com.developer.surveyapplication.repository.SurveyRepository;
import com.developer.surveyapplication.service.SurveyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyServiceImpl implements SurveyService {

    private final SurveyRepository surveyRepository
            ;

    public SurveyServiceImpl(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    @Override
    public List<SurveyEntity> findAllSurvey() {
        return surveyRepository.findAll();
    }
    @Override
    public Optional<SurveyEntity> findById(Long id) {
        return surveyRepository.findById(id);
    }

    @Override
    public SurveyEntity saveSurvey(SurveyEntity surveyEntity) {
        return surveyRepository.save(surveyEntity);
    }

    @Override
    public SurveyEntity updateSurvey(SurveyEntity surveyEntity) {
        return surveyRepository.save(surveyEntity);
    }

    @Override
    public void deleteSurvey(Long id) {
        surveyRepository.deleteById(id);
    }
}
