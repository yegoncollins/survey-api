package com.developer.surveyapplication.repository;

import com.developer.surveyapplication.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UsersEntity, Long> {
}
