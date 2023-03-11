package com.adilalouan.myfancypdfinvoices.service;

import com.adilalouan.myfancypdfinvoices.model.User;

import java.util.UUID;

public class UserService {
    public User findById(String id) {
        String randomName = UUID.randomUUID().toString();
        // always "finds" the user, every user has a random name
        return new User(id, randomName);
    }
}
