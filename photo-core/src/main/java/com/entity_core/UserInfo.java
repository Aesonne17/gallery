package com.entity_core;

/**
 * Entity for user's data
 * Created by Aesonne on 02.05.2017
 */
public class UserInfo {

    /**
     * Identifier
     */
    private Long id;

    /**
     * User's nickname. By the way used as a login for simple login process
     */
    private String nick;

    public UserInfo(Long id, String nick) {
        this.id = id;
        this.nick = nick;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

}
