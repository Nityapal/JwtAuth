package com.jwt.example.JWTExample.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String userId;
    private String name;
    private String email;

//    public User(String userId, String name, String email) {
//        this.userId = userId;
//        this.name = name;
//        this.email = email;
//    }
}
