package com.kk.majorProject.service;

import com.kk.majorProject.daolayer.DAOTwitterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.User;

@Component
public class TwitterUserService {

    @Autowired
    DAOTwitterServices daoTwitterServices;
    public ResponseList<Status> getTimeline() throws TwitterException {
        return daoTwitterServices.getTimeline();
    }

    public User getUser(String screenName) throws TwitterException{
        return daoTwitterServices.getUser(screenName);
    }

}
