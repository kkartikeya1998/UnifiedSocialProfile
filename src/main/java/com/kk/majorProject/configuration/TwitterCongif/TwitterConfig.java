package com.kk.majorProject.configuration.TwitterCongif;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Component
public class TwitterConfig {
    static ConfigurationBuilder cb = new ConfigurationBuilder();
    static public TwitterFactory tf = new TwitterFactory(cb.build());
    static public Twitter twitter = tf.getInstance();


    @Value("${oauth.consumerKey}")
    private static String consumerKey;

    @Value("${oauth.consumerSecret}")
    private static String consumerSecret;

    @Value("${oauth.accessToken}")
    private static String accessToken;

    @Value("${oauth.accessTokenSecret}")
    private static String accessTokenSecret;

    public static void setCb(ConfigurationBuilder cb) {

        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(consumerKey)
                .setOAuthConsumerSecret(consumerSecret)
                .setOAuthAccessToken(accessToken)
                .setOAuthAccessTokenSecret(accessTokenSecret);

    }

}
