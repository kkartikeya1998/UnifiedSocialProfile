package com.kk.majorProject.daolayer;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kk.majorProject.model.Codeforces.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class DOAUserService {

    @Autowired
    RestTemplate restTemplate;

    public User getUser(String url) throws IOException {

        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}
