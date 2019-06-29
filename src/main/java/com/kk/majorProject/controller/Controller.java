package com.kk.majorProject.controller;

import com.kk.majorProject.model.Codeforces.User;

import com.kk.majorProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    UserService userService;
    @GetMapping("/codeforces/{handle}")
    public User getCodeChefProfile(@PathVariable("handle") String handle) {

        return userService.getUser(handle);

    }


}
