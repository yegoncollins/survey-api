package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.AnswersEntity;
import com.developer.surveyapplication.entity.ChoicesEntity;
import com.developer.surveyapplication.service.AnswersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/questions/answers")
public class AnswersController {

    private final AnswersService answersService;

    public AnswersController(AnswersService answersService) {
        this.answersService = answersService;
    }

    @GetMapping
    public List<AnswersEntity> findAllAnswers(){return answersService.findAllAnswers();
    }
    @GetMapping("/{answer_id}")
    public Optional<AnswersEntity> findAnswerById(@PathVariable("answer_id") Long answer_id){
        return answersService.findBy_answer_id(answer_id);
    }
    @PostMapping
    public AnswersEntity saveAnswers(@RequestBody AnswersEntity answersEntity){
        Long userId = answersEntity.getUser_id();
        Long survey_questionId = answersEntity.getSurvey_question_id();
        Long choiceId = answersEntity.getChoice_id();

        answersEntity.setUser_id(userId);
        answersEntity.setSurvey_question_id(survey_questionId);
        answersEntity.setChoice_id(choiceId);
        return answersService.saveAnswers(answersEntity);
    }
    @PutMapping("/{answer_id}")
    public AnswersEntity updateAnswers(@PathVariable("answer_id") Long answer_id,@RequestBody AnswersEntity answersEntity){
        answersEntity.setAnswer_id(answer_id);
        return answersService.updateAnswers(answersEntity);
    }

    @DeleteMapping
    public void deleteAnswers(@PathVariable("answer_id") Long answer_id){
        answersService.deleteAnswers(answer_id);
    }

}
