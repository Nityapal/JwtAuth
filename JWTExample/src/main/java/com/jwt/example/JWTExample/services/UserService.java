package com.jwt.example.JWTExample.services;


import com.jwt.example.JWTExample.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store= new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"nitya pal","nitya@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"niti pal","niti@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"naty pal","naty@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"nita pal","nita@dev.in"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
