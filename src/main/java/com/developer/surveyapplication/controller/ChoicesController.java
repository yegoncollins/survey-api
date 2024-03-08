package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.AnswersEntity;
import com.developer.surveyapplication.entity.ChoicesEntity;
import com.developer.surveyapplication.entity.SurveyQuestionsEntity;
import com.developer.surveyapplication.entity.SurveySummaryEntity;
import com.developer.surveyapplication.service.ChoicesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/questions/choices")
public class ChoicesController {

    private final ChoicesService choicesService;

    public ChoicesController(ChoicesService choicesService) {
        this.choicesService = choicesService;
    }
    @GetMapping
    public List<ChoicesEntity> findAllChoices() {
        return choicesService.findAllChoices();
    }

    @GetMapping("/{choice_id}")
    public Optional<ChoicesEntity> findChoicesById(@PathVariable("choice_id") Long choice_id){
        return choicesService.findBy_choice_id(choice_id);
    }

    @PostMapping
    public ChoicesEntity saveChoices(@RequestBody ChoicesEntity choicesEntity){
        Long survey_question_id = choicesEntity.getSurvey_question_id();
        choicesEntity.setSurvey_question_id(survey_question_id);
        return choicesService.saveChoices(choicesEntity);
    }
    @PutMapping("/{choice_id}")
    public  ChoicesEntity updateChoices(@PathVariable("choice_id") Long choice_id, @RequestBody ChoicesEntity choicesEntity){
        choicesEntity.setChoice_id(choice_id);
        return choicesService.updateChoices(choicesEntity);
    }

    @DeleteMapping("/{choice_id}")
    public void deleteChoices(@PathVariable("choice_id") Long choice_id){
        choicesService.deleteChoices(choice_id);
    }

}