package com.developer.surveyapplication.repository;

import com.developer.surveyapplication.entity.ResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ResponseRepository extends JpaRepository<ResponseEntity, Long> {
}
