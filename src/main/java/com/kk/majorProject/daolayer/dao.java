package com.kk.majorProject.daolayer;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kk.majorProject.model.Codeforces.User;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

@org.springframework.stereotype.Service
public class dao {
    public static User readJsonFromUrl(URL url) throws IOException {
        StringBuffer rv = new StringBuffer();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str = "";
            while (null != (str = br.readLine())) {
                rv.append(str);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        String str = rv.toString();

        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(str, User.class);
        return user;
    }
}
