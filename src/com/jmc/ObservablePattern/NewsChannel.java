package com.jmc.ObservablePattern;

public class NewsChannel implements Channel {
    public void update(Object news) {
        System.out.println("Breaking News : " + news);
    }
}
