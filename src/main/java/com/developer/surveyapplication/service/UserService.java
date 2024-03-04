package com.developer.surveyapplication.service;

import com.developer.surveyapplication.entity.UsersEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UsersEntity> findAllUser();
    Optional<UsersEntity> findBy_user_id(Long user_id);
    UsersEntity saveUser( UsersEntity usersEntity);
    UsersEntity updateUser(UsersEntity usersEntity);
    void deleteUser (Long user_id);
}
