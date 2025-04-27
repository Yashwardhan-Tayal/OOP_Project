package com.socialmedia.platform;

public class Admin extends User {
    public Admin(Integer userId, String username) {
        super(userId, username);
        role="Admin";
    }

    public void manageUsers() {
        System.out.println(username+" is managing users and system settings");
    }

    @Override
    public void accessDashboard() {
        System.out.println("Admin Dashboard Accessed by "+username);
    }
}