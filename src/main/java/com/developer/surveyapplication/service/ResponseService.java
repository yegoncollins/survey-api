package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.ResponseEntity;



import java.util.List;
import java.util.Optional;

public interface ResponseService {
    List<ResponseEntity> findAllResponse();
    Optional<ResponseEntity> findById(Long id);
    ResponseEntity saveResponse( ResponseEntity responseEntity);
    ResponseEntity updateResponse(ResponseEntity responseEntity);
    void deleteResponse (Long id);
}
