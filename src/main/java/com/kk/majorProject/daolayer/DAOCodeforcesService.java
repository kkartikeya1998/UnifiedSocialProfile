package com.kk.majorProject.daolayer;

import com.kk.majorProject.model.Codeforces.User;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class DAOCodeforcesService {


    public User getUser(String url) {
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }

}
