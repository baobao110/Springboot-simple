package com.sample.sample.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User {
    public int id;

    public String username;

    public String password;

    public Date createtime;
}

