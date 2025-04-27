package com.socialmedia.platform;
public class PostManager {
    public void schedulePost(String content, String dateTime) {
        System.out.println("Scheduled post: " + content + " at " + dateTime);
    }

    public void schedulePost(String... posts){ // Varargs
        for (String post : posts) {
            System.out.println("Scheduled: " + post);
        }
    }

    // Nested static class
    public static class HashtagTracker {
        public void track(String hashtag) {
            System.out.println("Tracking hashtag: " + hashtag);
        }
    }
}