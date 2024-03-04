package com.developer.surveyapplication.service.impl;

import com.developer.surveyapplication.entity.ChoicesEntity;
import com.developer.surveyapplication.repository.ChoicesRepository;
import com.developer.surveyapplication.service.ChoicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChoicesServiceImpl implements ChoicesService {

    private final ChoicesRepository choicesRepository;

    @Autowired
    public ChoicesServiceImpl(ChoicesRepository choicesRepository) {
        this.choicesRepository = choicesRepository;
    }

    @Override
    public List<ChoicesEntity> findAllChoices() {
        return choicesRepository.findAll();
    }

    @Override
    public Optional<ChoicesEntity> findBy_choice_id(Long choice_id) {
        return choicesRepository.findById(choice_id);
    }

    @Override
    public ChoicesEntity saveChoices(ChoicesEntity choicesEntity) {
        return choicesRepository.save(choicesEntity);
    }

    @Override
    public ChoicesEntity updateChoices(ChoicesEntity choicesEntity) {
        return choicesRepository.save(choicesEntity);
    }

    @Override
    public void deleteChoices(Long choice_id) {
        choicesRepository.deleteById(choice_id);
    }
}
