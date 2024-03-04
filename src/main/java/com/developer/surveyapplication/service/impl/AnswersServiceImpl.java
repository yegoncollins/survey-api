package com.developer.surveyapplication.service.impl;

import com.developer.surveyapplication.entity.AnswersEntity;
import com.developer.surveyapplication.repository.AnswersRepository;
import com.developer.surveyapplication.service.AnswersService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswersServiceImpl implements AnswersService {

    private final AnswersRepository answersRepository
            ;

    public AnswersServiceImpl(AnswersRepository answersRepository) {
        this.answersRepository = answersRepository;
    }

    @Override
    public List<AnswersEntity> findAllAnswers() {
        return answersRepository.findAll();
    }
    @Override
    public Optional<AnswersEntity> findBy_answer_id(Long answer_id) {
        return answersRepository.findById(answer_id);
    }

    @Override
    public AnswersEntity saveAnswers(AnswersEntity answersEntity) {
        return answersRepository.save(answersEntity);
    }

    @Override
    public AnswersEntity updateAnswers(AnswersEntity answersEntity) {
        return answersRepository.save(answersEntity);
    }

    @Override
    public void deleteAnswers(Long answer_id) {
        answersRepository.deleteById(answer_id);
    }
}
