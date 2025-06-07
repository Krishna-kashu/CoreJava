package com.mywork.exceptionWorld.dto;

public class UserDTO {
    private String nickname;
    public UserDTO(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }
}
