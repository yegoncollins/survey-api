package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.SurveyQuestionsEntity;

import com.developer.surveyapplication.service.SurveyQuestionsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/survey/questions")
public class SurveyQuestionsController {

    private final SurveyQuestionsService surveyQuestionsService;

    public SurveyQuestionsController(SurveyQuestionsService surveyQuestionsService) {
        this.surveyQuestionsService = surveyQuestionsService;
    }

    @GetMapping
    public List<SurveyQuestionsEntity> findAllSurveyQuestions(){return surveyQuestionsService.findAllSurveyQuestions();
    }
    @GetMapping("/{survey_question_id}")
    public Optional<SurveyQuestionsEntity> findSurveyQuestionsById(@PathVariable("survey_question_id") Long survey_question_id){
        return surveyQuestionsService.findBy_survey_question_id(survey_question_id);
    }
    @PostMapping
    public SurveyQuestionsEntity saveSurveyQuestions(Long survey_question_id, @RequestBody SurveyQuestionsEntity surveyQuestionsEntity){
        return surveyQuestionsService.saveSurveyQuestions(surveyQuestionsEntity);
    }
    @PutMapping("/{survey_question_id}")
    public SurveyQuestionsEntity updateSurveyQuestions(@PathVariable("survey_question_id") Long survey_question_id, @RequestBody SurveyQuestionsEntity surveyQuestionsEntity){
        return surveyQuestionsService.updateSurveyQuestions(surveyQuestionsEntity);
    }

    @DeleteMapping("/{survey_question_id}")
    public void deleteSurveyQuestions(@PathVariable("survey_question_id") Long survey_question_id){
        surveyQuestionsService.deleteSurveyQuestions(survey_question_id);
    }

}
