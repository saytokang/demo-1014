package com.example.demojdbc.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "User")
@NoArgsConstructor
@Getter
public class UserEntity {
    @Id
    private String id;

    private String name;

    @Column(name = "reg_dt")
    private LocalDateTime regDate;

    public UserEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeUsernaem(String name) {
        this.name = name;
    }
}
