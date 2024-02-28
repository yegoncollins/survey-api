package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.UsersEntity;
import com.developer.surveyapplication.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UsersEntity> findAllUsers(){
     return userService.findAllUser();
    }
    @GetMapping("/{id}")
    public Optional<UsersEntity> findUserById(@PathVariable("id") Long id){
        return userService.findById(id);
    }
    @PostMapping
    public UsersEntity saveUser(@RequestBody UsersEntity usersEntity){
        return userService.saveUser(usersEntity);
    }
    @PutMapping
    public  UsersEntity updateUser(@RequestBody UsersEntity usersEntity){
        return userService.updateUser(usersEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

}
