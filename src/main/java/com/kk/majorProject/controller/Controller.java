package com.kk.majorProject.controller;

import com.kk.majorProject.daolayer.dao;
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
    public User getCodeChefProfile(@PathVariable("handle") String handle) throws IOException, ParseException {
        URL url = new URL(" http://codeforces.com/api/user.info?handles=" + handle);

        return dao.readJsonFromUrl(url);

    }


}
