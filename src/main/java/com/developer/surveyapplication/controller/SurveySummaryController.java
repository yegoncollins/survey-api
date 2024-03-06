package com.developer.surveyapplication.controller;

import com.developer.surveyapplication.entity.SurveySummaryEntity;
import com.developer.surveyapplication.service.SurveySummaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/survey/summary")
public class SurveySummaryController {

    private final SurveySummaryService surveySummaryService;

    public SurveySummaryController(SurveySummaryService surveySummaryService) {
        this.surveySummaryService = surveySummaryService;
    }

    @GetMapping
    public List<SurveySummaryEntity> findAllSurveySummary() {
        return surveySummaryService.findAllSurveySummary();
    }

    @GetMapping("/{survey_summary_id}")
    public Optional<SurveySummaryEntity> findSurveySummaryById(@PathVariable("survey_summary_id") Long survey_summary_id) {
        return surveySummaryService.findBy_survey_summary_id(survey_summary_id);
    }

    @PostMapping("/{survey_summary_id}")
    public SurveySummaryEntity saveSurveySummary(@RequestBody SurveySummaryEntity surveySummaryEntity) {
        return surveySummaryService.saveSurveySummary(surveySummaryEntity);
    }

    @PutMapping("/{survey_summary_id}")
    public SurveySummaryEntity updateSurveySummary(@PathVariable("survey_summary_id") Long survey_summary_id, @RequestBody SurveySummaryEntity surveySummaryEntity) {
        surveySummaryEntity.setSurvey_summary_id(survey_summary_id);
        return surveySummaryService.updateSurveySummary(surveySummaryEntity);
    }

    @DeleteMapping("/{survey_summary_id}")
    public void deleteSurveySummary(@PathVariable("survey_summary_id") Long survey_summary_id) {
        surveySummaryService.deleteSurveySummary(survey_summary_id);
    }
}
