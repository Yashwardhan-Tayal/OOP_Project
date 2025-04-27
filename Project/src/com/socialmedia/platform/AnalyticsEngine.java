package com.socialmedia.platform;
import java.io.*;
import java.util.Scanner;
import com.socialmedia.interfaces.*;
public class AnalyticsEngine implements EngagementMetrics, SentimentAnalyzer {

    public void logToFile(String data) throws IOException {
        FileWriter fw = new FileWriter("analytics.txt", true);
        fw.write(data + "\n");
        fw.close();
    }

    public void readFromFile() throws FileNotFoundException {
        File file = new File("analytics.txt");
        Scanner s = new Scanner(file);
        while (s.hasNextLine()) {
            System.out.println(s.nextLine());
        }
        s.close();
    }

    @Override
    public void trackLikes() {
        System.out.println("Tracking likes...");
    }

    @Override
    public void analyzeSentiment(String comment) {
        System.out.println("Analyzing sentiment for: " + comment);
    }
}