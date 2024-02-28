package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.UsersEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UsersEntity> findAllUser();
    Optional<UsersEntity> findById(Long id);
    UsersEntity saveUser( UsersEntity usersEntity);
    UsersEntity updateUser(UsersEntity usersEntity);
    void deleteUser (Long id);
}
