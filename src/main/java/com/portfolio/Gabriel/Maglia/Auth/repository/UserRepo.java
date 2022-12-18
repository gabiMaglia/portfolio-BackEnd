package com.portfolio.Gabriel.Maglia.Auth.repository;

import com.portfolio.Gabriel.Maglia.Auth.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
