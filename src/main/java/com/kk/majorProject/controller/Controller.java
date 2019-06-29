package com.kk.majorProject.controller;

import com.kk.majorProject.daolayer.dao;
import com.kk.majorProject.model.Codeforces.Result;
import com.kk.majorProject.model.Codeforces.User;

import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

@RestController
public class Controller {

    @GetMapping("/codeforces/{handle}")
    public User getCodeChefProfile(@PathVariable("handle") String handle) throws IOException {
        String[] handles = handle.split("[$]");

        StringBuilder handleBuilder = new StringBuilder(handles[0]);
        for (int i = 1; i < handles.length; i++)
            handleBuilder.append(';').append(handles[i]);


        String url = "http://codeforces.com/api/user.info?handles=" + handleBuilder.toString();
        return dao.readJsonFromUrl(url);

    }


}
