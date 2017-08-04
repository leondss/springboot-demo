package com.springboot.demo.service.impl;

import com.springboot.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Leon
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "Leon";
    }
}
