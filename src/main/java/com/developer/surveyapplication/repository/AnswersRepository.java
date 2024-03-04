package com.developer.surveyapplication.repository;

import com.developer.surveyapplication.entity.AnswersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends JpaRepository<AnswersEntity, Long> {
}
