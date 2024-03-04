package com.developer.surveyapplication.repository;

import com.developer.surveyapplication.entity.SurveySummaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveySummaryRepository extends JpaRepository<SurveySummaryEntity, Long> {
}
