package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.AnswersEntity;
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
    public Optional<AnswersEntity> findAnswersById(@PathVariable("answer_id") Long answer_id){return answersService.findBy_answer_id(answer_id);
    }
    @PostMapping
    public AnswersEntity saveAnswers(@RequestBody AnswersEntity answersEntity){
        return answersService.saveAnswers(answersEntity);
    }
    @PutMapping
    public AnswersEntity updateAnswers(@RequestBody AnswersEntity answersEntity){
        return answersService.updateAnswers(answersEntity);
    }

    @DeleteMapping("/{answer_id}")
    public void deleteAnswers(@PathVariable("answer_id") Long answer_id){
        answersService.deleteAnswers(answer_id);
    }

}
