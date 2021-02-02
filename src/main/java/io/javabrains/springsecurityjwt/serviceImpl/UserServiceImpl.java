package io.javabrains.springsecurityjwt.serviceImpl;

import io.javabrains.springsecurityjwt.entity.UserEntity;
import io.javabrains.springsecurityjwt.repository.UserRepository;
import io.javabrains.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public UserEntity addUser(UserEntity userEntity) {
        String pwd = userEntity.getPassword();
        String encryptPwd = passwordEncoder.encode(pwd);
        userEntity.setPassword(encryptPwd);
        return userRepository.save(userEntity);
    }
}
