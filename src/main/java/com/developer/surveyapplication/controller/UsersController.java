package com.developer.surveyapplication.controller;


import com.developer.surveyapplication.entity.UsersEntity;
import com.developer.surveyapplication.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UsersEntity> findAllUsers(){
     return userService.findAllUser();
    }
    @GetMapping("/{user_id}")
    public Optional<UsersEntity> findUserById(@PathVariable("user_id") Long user_id){
        return userService.findBy_user_id(user_id);
    }
    @PostMapping
    public UsersEntity saveUser(@RequestBody UsersEntity usersEntity){
        return userService.saveUser(usersEntity);
    }
    @PutMapping("/{user_id}")
    public  UsersEntity updateUser(@PathVariable("user_id") Long user_id, @RequestBody UsersEntity usersEntity){
        usersEntity.setUser_id(user_id);
        return userService.updateUser(usersEntity);
    }

    @DeleteMapping("/{user_id}")
    public void deleteUser(@PathVariable("user_id") Long user_id){
        userService.deleteUser(user_id);
    }

}
