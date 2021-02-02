package io.javabrains.springsecurityjwt.service;

import io.javabrains.springsecurityjwt.entity.UserEntity;
import org.springframework.security.core.userdetails.User;

public interface UserService {
    public UserEntity addUser(UserEntity userEntity);
}
