package com.socialmedia.platform;
import com.socialmedia.exceptions.EmptyPostException;
public class ContentCreator extends User {
    public ContentCreator(Integer userId, String username) {
        super(userId, username);
        role="ContentCreator";
    }

    public void createPost(String content) throws EmptyPostException {
    	if(content==null)throw new EmptyPostException();
        System.out.println("Creating post: " + content);
    }
    
    public void createPost(String content, String media) {
    	System.out.println("Creating post: "+content+"["+media+"]");
    }
    @Override
    public void accessDashboard() {
        System.out.println("Content Creator Dashboard Accessed.");
    }
}