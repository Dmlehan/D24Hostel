package com.d24.manage.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="user")
public class User implements SuperEntity{
    @Id
    private String username;
    private String password;
    private String jobRole;
    private String passwordHint;
}
