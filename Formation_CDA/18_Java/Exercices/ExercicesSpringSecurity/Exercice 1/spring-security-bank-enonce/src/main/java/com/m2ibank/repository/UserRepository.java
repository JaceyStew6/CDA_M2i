package com.m2ibank.repository;

import com.m2ibank.model.Accounts;
import com.m2ibank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

//    List<User> findByUserId(Long id);
}
