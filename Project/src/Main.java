import com.socialmedia.platform.*;
import com.socialmedia.exceptions.*;

public class Main {
    public static void main(String[] args) throws EmptyPostException {
    	
    	//Users
        ContentCreator creator = new ContentCreator(101, "Yashwardhan");
        Admin admin=new Admin(102,"Shikhar");
        MarketingAnalyst analyst=new MarketingAnalyst(103,"Janav");

        PostManager manager = new PostManager();
        
        creator.accessDashboard();
        creator.createPost("My First Post", "selfie.jpg");
        manager.schedulePost("Hello World!", "2025-04-14T10:00");
        manager.schedulePost("Post 1", "Post 2", "Post 3");
        admin.manageUsers();
        analyst.analyzeTrends();
        
        

        PostManager.HashtagTracker tracker = new PostManager.HashtagTracker();
        tracker.track("#Java");

        AIRecommender ai = new AIRecommender();
        new Thread(ai).start();
        ai.suggestHashtags("#Growth", "#Analytics");

        try {
            AnalyticsEngine engine = new AnalyticsEngine();
            engine.logToFile("Engagement spike detected.");
            engine.readFromFile();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}