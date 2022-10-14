package com.example.demojdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demojdbc.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    
}
