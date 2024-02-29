package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.SurveyEntity;

import com.developer.surveyapplication.service.SurveyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/questions")
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping
    public List<SurveyEntity> findAllSurvey(){return surveyService.findAllSurvey();
    }
    @GetMapping("/{id}")
    public Optional<SurveyEntity> findSurveyById(@PathVariable("id") Long id){
        return surveyService.findById(id);
    }
    @PostMapping
    public SurveyEntity saveSurvey(@RequestBody SurveyEntity surveyEntity){
        return surveyService.saveSurvey(surveyEntity);
    }
    @PutMapping
    public  SurveyEntity updateSurvey(@RequestBody SurveyEntity surveyEntity){
        return surveyService.updateSurvey(surveyEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteSurvey(@PathVariable("id") Long id){
        surveyService.deleteSurvey(id);
    }

}
