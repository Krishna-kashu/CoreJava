package com.mywork.exceptionWorld.service;

import com.mywork.exceptionWorld.dto.UserDTO;

public class UserService {
    public void displayNickname(UserDTO user) {
        try {
            System.out.println("Nickname: " + user.getNickname().toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Nickname is not available.");
        }
    }
}