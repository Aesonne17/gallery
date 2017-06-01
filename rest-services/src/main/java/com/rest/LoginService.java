package com.rest;

import com.entity_core.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Service for registration and login
 * Created by Aesonne on 02.05.2017
 * TODO: just a stub
 */
@RestController
public class LoginService {

    /**
     * Service for login
     * @param login user's login and nick
     * @param pswd user's password
     * @return user info including identifier
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserInfo login(@RequestParam(value="login", defaultValue="usr1") String login,
                              @RequestParam(value="pswd", defaultValue="123456") String pswd) {
        return new UserInfo(1l, "Chui");
    }

}
