package com.developer.surveyapplication.service.impl;

import com.developer.surveyapplication.entity.SurveySummaryEntity;
import com.developer.surveyapplication.repository.SurveySummaryRepository;
import com.developer.surveyapplication.service.SurveySummaryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveySummaryImpl implements SurveySummaryService {

    private final SurveySummaryRepository surveysummaryRepository
            ;

    public SurveySummaryImpl(SurveySummaryRepository surveySummaryRepository, SurveySummaryRepository surveysummaryRepository) {
        this.surveysummaryRepository = surveysummaryRepository;

    }

    @Override
    public List<SurveySummaryEntity> findAllSurveySummary() {
        return surveysummaryRepository.findAll();
    }
    @Override
    public Optional<SurveySummaryEntity> findBy_survey_summary_id(Long survey_summary_id) {
        return surveysummaryRepository.findById(survey_summary_id);
    }

    @Override
    public SurveySummaryEntity saveSurveySummary(SurveySummaryEntity surveySummaryEntity) {
        return surveysummaryRepository.save(surveySummaryEntity);
    }

    @Override
    public SurveySummaryEntity updateSurveySummary(SurveySummaryEntity surveySummaryEntity) {
        return surveysummaryRepository.save(surveySummaryEntity);
    }

    @Override
    public void deleteSurveySummary(Long survey_summary_id) {
        surveysummaryRepository.deleteById(survey_summary_id);
    }
}
