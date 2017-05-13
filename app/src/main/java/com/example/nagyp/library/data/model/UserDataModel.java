package com.example.nagyp.library.data.model;

/**
 * Created by nagyp on 5/13/2017.
 */

public class UserDataModel {

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public int getAccess_level() {
        return access_level;
    }

    public void setAccess_level(int access_level) {
        this.access_level = access_level;
    }

    private int user_id;
    private String username;
    private String password;
    private String display_name;
    private int access_level;


   public UserDataModel(int user_id, String username, String password, String display_name, int access_level)
    {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.display_name = display_name;
        this.access_level = access_level;

    }

    public UserDataModel(String username, String password, String display_name, int access_level)
    {
        this.username = username;
        this.password = password;
        this.display_name = display_name;
        this.access_level = access_level;

    }




}
