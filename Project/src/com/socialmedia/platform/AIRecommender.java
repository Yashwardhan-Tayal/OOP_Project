package com.socialmedia.platform;
public class AIRecommender implements Runnable {
    @Override
    public void run() {
        System.out.println("Analyzing post performance to optimize timing...");
    }

    // Varargs Overload
    public void suggestHashtags(String... tags) {
        for (String tag : tags) {
            System.out.println("Suggested hashtag: " + tag);
        }
    }
}