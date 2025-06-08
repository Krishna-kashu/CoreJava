package com.mywork.exceptionWorld.dto;

public class UserDTO {
    private String nickName;
    public UserDTO(String nickName) {
        this.nickName = nickName;
    }
    public String getNickname() {
        return nickName;
    }
}
