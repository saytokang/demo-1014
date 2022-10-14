package com.example.demojdbc.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demojdbc.dto.UserDto;
import com.example.demojdbc.entity.UserEntity;
import com.example.demojdbc.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public List<UserDto> call() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(u -> new UserDto()).collect(Collectors.toList());
    }

    @Transactional
    public void create(UserDto user) {
        UserEntity userEntity =  user.toEntity();
        userRepository.save(userEntity);
    }



    
}
