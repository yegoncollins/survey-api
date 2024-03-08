package com.developer.surveyapplication.repository;

import com.developer.surveyapplication.entity.ChoicesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ChoicesRepository extends JpaRepository<ChoicesEntity, Long> {

}
