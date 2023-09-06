package com.d24.manage.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class UserDto implements SuperDto{

    private String username;
    private String password;
    private String jobRole;
    private String passwordHint;
}
