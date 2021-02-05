package io.javabrains.springsecurityjwt.serviceImpl;

import io.javabrains.springsecurityjwt.entity.UserEntity;
import io.javabrains.springsecurityjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<UserEntity> user = Optional.ofNullable(repository.findByUserName(userName).orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName)));
        return new org.springframework.security.core.userdetails.User(user.get().getUserName(), user.get().getPassword(), new ArrayList<>());
    }
}