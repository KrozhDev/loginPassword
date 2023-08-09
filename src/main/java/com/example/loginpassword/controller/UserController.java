package com.example.loginpassword.controller;


import com.example.loginpassword.exception.AppError;
import com.example.loginpassword.model.User;
import com.example.loginpassword.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ResponseEntity<?> login(@RequestParam("name") String name,
                                      @RequestParam("password") String password) {
        try {
            User user = userService.login(name, password).orElseThrow();
            return ResponseEntity.ok(user);
        } catch (Exception e){
            return new ResponseEntity<>(new AppError(HttpStatus.NOT_FOUND.value(),
                    "Invalid name and/or password"),
                    HttpStatus.NOT_FOUND);
        }
    }


}
