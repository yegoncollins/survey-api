package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.ChoicesEntity;
import java.util.List;
import java.util.Optional;

public interface ChoicesService {
    List<ChoicesEntity> findAllChoices();
    Optional<ChoicesEntity> findBy_choice_id(Long choice_id);
    ChoicesEntity saveChoices(ChoicesEntity choicesEntity);
    ChoicesEntity updateChoices(ChoicesEntity choicesEntity);
    void deleteChoices(Long choice_id);


}
