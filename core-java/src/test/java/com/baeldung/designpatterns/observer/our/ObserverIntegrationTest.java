package com.baeldung.designpatterns.observer.our;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ObserverIntegrationTest {
    
    @Test
    public void whenChangingObservableState_thenObserverNotified() {

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);

        observable.setNews("news1");
        assertEquals(observer.getNews(), "news1");

        observable.setNews("news2");
        assertEquals(observer.getNews(), "news2");
    }
}
