package com.mywork.exceptionWorld.runner;

import com.mywork.exceptionWorld.dto.UserDTO;
import com.mywork.exceptionWorld.service.UserService;

public class UserRunner {
    public static void main(String[] args) {
        UserDTO user = new UserDTO("krish");
        UserDTO user1 = new UserDTO(null);

        new UserService().displayNickname(user);
        new UserService().displayNickname(user1);
    }
}
