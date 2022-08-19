package com.jmc.ObservablePattern;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency("No News");
        NewsChannel channelOne=new NewsChannel();
        newsAgency.addObserver(channelOne);
        newsAgency.setNews("Elections have started");
    }
}
