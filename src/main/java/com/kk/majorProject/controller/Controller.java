package com.kk.majorProject.controller;

import com.kk.majorProject.model.Codeforces.User;

import com.kk.majorProject.service.CodeforcesUserService;
import com.kk.majorProject.service.TwitterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;


@RestController
public class Controller {

    // CODEFORCES
    @Autowired
    CodeforcesUserService userCodeforcesUserService;

    @GetMapping("/codeforces/{handle}")
    public User getCodeChefProfile(@PathVariable("handle") String handle) {

        return userCodeforcesUserService.getUser(handle);

    }

    // TWITTER
    @Autowired
    TwitterUserService twitterUserService;

    @GetMapping("/twitter/user/{screenName}")
    public twitter4j.User getTwitterUser(@PathVariable("screenName") String screenName) throws TwitterException {
        return twitterUserService.getUser(screenName);
    }

    @GetMapping("/twitter/timeline")
    public ResponseList<Status> getTwitterTimeline() throws TwitterException {
        return twitterUserService.getTimeline();
    }

}
