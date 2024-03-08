package com.developer.surveyapplication.service.impl;

import com.developer.surveyapplication.entity.UsersEntity;
import com.developer.surveyapplication.repository.UserRepository;
import com.developer.surveyapplication.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public List<UsersEntity> findAllUser() {
        return userRepository.findAll();
    }
    @Override
    public Optional<UsersEntity> findBy_user_id(Long user_id) {
        return userRepository.findById(user_id);
    }
    @Override
    public UsersEntity saveUser(UsersEntity usersEntity) {
        return userRepository.save(usersEntity);
    }
    @Override
    public UsersEntity updateUser(UsersEntity usersEntity) {
        return userRepository.save(usersEntity);
    }
    @Override
    public void deleteUser(Long user_id) {
       userRepository.deleteById(user_id);
    }
}
