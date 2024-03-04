package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.AnswersEntity;



import java.util.List;
import java.util.Optional;

public interface AnswersService {
    List<AnswersEntity> findAllAnswers();
    Optional<AnswersEntity> findBy_answer_id(Long answer_id);
    AnswersEntity saveAnswers(AnswersEntity answersEntity);
    AnswersEntity updateAnswers(AnswersEntity answersEntity);
    void deleteAnswers (Long answer_id);
}
