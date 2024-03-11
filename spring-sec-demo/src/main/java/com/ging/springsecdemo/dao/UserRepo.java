package com.ging.springsecdemo.dao;

import com.ging.springsecdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String name);
}
