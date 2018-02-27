package com.sample.sample.service;

import com.sample.sample.dao.UserMapper;
import com.sample.sample.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserMapper u;

    public int add (User user){
        int i=u.add(user);
        return i;
    }


}
