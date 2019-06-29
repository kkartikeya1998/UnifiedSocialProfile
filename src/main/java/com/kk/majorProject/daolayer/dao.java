package com.kk.majorProject.daolayer;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kk.majorProject.model.Codeforces.User;
import org.json.simple.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@org.springframework.stereotype.Service
public class dao {
    public static User readJsonFromUrl(String url) throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        String str = restTemplate.getForObject(url, String.class);
        System.out.println(str);
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(str, User.class);
        return user;
    }
}
