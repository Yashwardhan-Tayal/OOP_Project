package com.socialmedia.platform;
public abstract class User {
    protected Integer userId;  // Wrapper class
    protected String username;
    protected String role="User";

    public User(Integer userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public abstract void accessDashboard();

    // Overloaded constructor
    public User(String username) {
        this.userId = 0;
        this.username = username;
    }
}