package com.kk.majorProject.daolayer;

import com.kk.majorProject.configuration.TwitterCongif.TwitterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.User;
import twitter4j.TwitterException;

@Component
public class DAOTwitterServices {
    @Autowired
    TwitterConfig twitterConfig;

    public User getUser(String screenName) throws TwitterException {
        return twitterConfig.twitter.showUser(screenName);
    }
    public ResponseList<Status> getTimeline() throws TwitterException {
        return twitterConfig.twitter.getHomeTimeline();
    }
}
