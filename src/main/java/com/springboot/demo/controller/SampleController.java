package com.springboot.demo.controller;

import com.springboot.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Leon
 */
@RestController
public class SampleController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    String home() {
        return userService.getName();
    }


}
