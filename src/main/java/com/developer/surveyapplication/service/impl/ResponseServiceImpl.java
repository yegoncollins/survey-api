package com.developer.surveyapplication.service.impl;

import com.developer.surveyapplication.entity.ResponseEntity;
import com.developer.surveyapplication.repository.ResponseRepository;
import com.developer.surveyapplication.service.ResponseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponseServiceImpl implements ResponseService {

    private final ResponseRepository responseRepository
            ;

    public ResponseServiceImpl(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    @Override
    public List<ResponseEntity> findAllResponse() {
        return responseRepository.findAll();
    }
    @Override
    public Optional<ResponseEntity> findById(Long id) {
        return responseRepository.findById(id);
    }

    @Override
    public ResponseEntity saveResponse(ResponseEntity responseEntity) {
        return responseRepository.save(responseEntity);
    }

    @Override
    public ResponseEntity updateResponse(ResponseEntity responseEntity) {
        return responseRepository.save(responseEntity);
    }

    @Override
    public void deleteResponse(Long id) {
        responseRepository.deleteById(id);
    }
}
