package io.javabrains.springsecurityjwt.controller;

import io.javabrains.springsecurityjwt.entity.UserEntity;
import io.javabrains.springsecurityjwt.repository.UserRepository;
import io.javabrains.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminResource {

    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public String addUserByAdmin(@RequestBody UserEntity user) {

        userService.addUser(user);
        return "user added successfully...";
    }
}
