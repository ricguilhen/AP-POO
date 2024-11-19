package com.javaproject.appoo.repository;


import com.javaproject.appoo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    UserDetails findByLogin(String login);
}
