package com.example.loginpassword.repository;

import com.example.loginpassword.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByNameAndPassword(String name, String password);
}
