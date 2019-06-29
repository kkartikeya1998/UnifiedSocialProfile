package com.kk.majorProject.service;

import com.kk.majorProject.daolayer.DAOUserService;
import com.kk.majorProject.model.Codeforces.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class UserService {

    @Autowired
    DAOUserService daoUserService;

    public User getUser(String handle){
        String[] handles = handle.split("[$]");

        StringBuilder handleBuilder = new StringBuilder(handles[0]);
        for (int i = 1; i < handles.length; i++)
            handleBuilder.append(';').append(handles[i]);


        String url = "http://codeforces.com/api/user.info?handles=" + handleBuilder.toString();
        return daoUserService.getUser(url);

    }

}
