package com.ging.springsecdemo.service;

import com.ging.springsecdemo.dao.UserRepo;
import com.ging.springsecdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepo repo;

    // can create different way  -> @Bean in config
    private BCryptPasswordEncoder encode = new BCryptPasswordEncoder(12);

    public User saveUser(User user){
        user.setPassword(encode.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user);
    }
}
