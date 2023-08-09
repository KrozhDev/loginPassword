package com.example.loginpassword.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.implementation.bind.annotation.Empty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppError {
    private int statusCode;
    private String message;

}