package com.example.demojdbc.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojdbc.dto.UserDto;
import com.example.demojdbc.service.UserService;

import lombok.RequiredArgsConstructor;

// @Controller
@RestController
@RequestMapping("/")
// @RequiredArgsConstructor
public class HomeController {
    private final UserService userService ;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<?> home() {
        return ResponseEntity.ok("home");
    }

    @GetMapping("/demo")
    public ResponseEntity<?> home1() {
        return ResponseEntity.ok("home demo");
    }

    @GetMapping("/users")
    public ResponseEntity<?> users () {
        List<UserDto> users =  userService.call();
        return ResponseEntity.ok().body(users);
    }


    @PostMapping("/users")
    public ResponseEntity<?> usersPost (@RequestBody UserDto user) {
        userService.create(user);
        return ResponseEntity.ok().body("OK");
    }
    

}
