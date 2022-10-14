package com.example.demojdbc.dto;

import com.example.demojdbc.entity.UserEntity;

import lombok.Getter;

@Getter
public class UserDto {
    private String id;
    private String name;

    public UserEntity toEntity() {
        return new UserEntity(this.id, this.name);
    }

}
