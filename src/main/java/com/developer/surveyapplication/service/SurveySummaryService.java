package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.SurveySummaryEntity;


import java.util.List;
import java.util.Optional;

public interface SurveySummaryService {
    List<SurveySummaryEntity> findAllSurveySummary();
    Optional<SurveySummaryEntity> findBy_survey_summary_id(Long survey_summary_id);
    SurveySummaryEntity saveSurveySummary(SurveySummaryEntity surveySummaryEntity);

    SurveySummaryEntity updateSurveySummary(SurveySummaryEntity surveySummaryEntity);

    void deleteSurveySummary(Long survey_summary_id);
}

