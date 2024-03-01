package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.ResponseEntity;
import com.developer.surveyapplication.service.ResponseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/questions/responses")
public class ResponseController {

    private final ResponseService responseService;

    public ResponseController(ResponseService responseService) {
        this.responseService = responseService;
    }

    @GetMapping
    public List<ResponseEntity> findAllResponse(){return responseService.findAllResponse();
    }
    @GetMapping("/{id}")
    public Optional<ResponseEntity> findResponseById(@PathVariable("id") Long id){return responseService.findById(id);
    }
    @PostMapping
    public ResponseEntity saveResponse(@RequestBody ResponseEntity responseEntity){
        return responseService.saveResponse(responseEntity);
    }
    @PutMapping
    public  ResponseEntity updateResponse(@RequestBody ResponseEntity responseEntity){
        return responseService.updateResponse(responseEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteResponse(@PathVariable("id") Long id){
        responseService.deleteResponse(id);
    }

}
