package com.unitedcoder.jsonfile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unitedcoder.cubecartautomation.LoginUser;

import java.util.List;

public class Users {
    @JsonProperty("users")
    private List<LoginUser> users;

    public Users(List<LoginUser> users) {
        this.users = users;
    }

    public Users() {
    }

    public List<LoginUser> getUsers() {
        return users;
    }
}
