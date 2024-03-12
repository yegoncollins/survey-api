package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.AnswersEntity;
import com.developer.surveyapplication.entity.SurveySummaryEntity;
import com.developer.surveyapplication.entity.SurveysEntity;

import com.developer.surveyapplication.service.SurveysService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/surveys")
@CrossOrigin(origins ="*")
public class SurveysController {

    private final SurveysService surveysService;

    public SurveysController(SurveysService surveysService) {
        this.surveysService = surveysService;
    }

    @GetMapping
    public List<SurveysEntity> findAllSurveys(){return surveysService.findAllSurveys();
    }
    @GetMapping("/{surveys_id}")
    public Optional<SurveysEntity> findSurveysById(@PathVariable("surveys_id") Long surveys_id){
        return surveysService.findBy_survey_id(surveys_id);
    }
    @PostMapping
    public SurveysEntity saveSurveys(@RequestBody SurveysEntity surveysEntity){
        Long userId = surveysEntity.getUser_id();
        surveysEntity.setUser_id(userId);
        return surveysService.saveSurveys(surveysEntity);
    }
    @PutMapping("/{surveys_id}")
    public  SurveysEntity updateSurveys(@PathVariable("surveys_id") Long surveys_id, @RequestBody SurveysEntity surveysEntity){
        surveysEntity.setSurvey_id(surveys_id);
        return surveysService.updateSurveys(surveysEntity);
    }

    @DeleteMapping("/{surveys_id}")
    public void deleteSurveys(@PathVariable("surveys_id") Long surveys_id){
        surveysService.deleteSurveys(surveys_id);
    }

}
