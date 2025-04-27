package com.socialmedia.platform;
public class MarketingAnalyst extends Admin {
    public MarketingAnalyst(Integer userId, String username) {
        super(userId, username);
    }

    public void analyzeTrends() {
        System.out.println(username+" is analyzing trends...");
    }

    @Override
    public void accessDashboard() {
        System.out.println("Marketing Analyst Dashboard Accessed.");
    }
}