package org.example.springsecurityjwt.dao;

import org.example.springsecurityjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
