package com.example.web_project.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private String userId;
    private String userName;
    private String userPw;
    private String userAddress;
    private String userEmail;
    private int userAge;
    private String userRole;
}
