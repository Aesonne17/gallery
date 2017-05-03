package com.entity_core;

import java.math.BigInteger;

/**
 * Entity for user's data
 * Created by Aesonne on 02.05.2017
 */
public class UserInfo {

    /**
     * Identifier
     */
    private BigInteger id;

    /**
     * User's nickname. By the way used as a login for simple login process
     */
    private String nick;

    public UserInfo(BigInteger id, String nick) {
        this.id = id;
        this.nick = nick;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

}
