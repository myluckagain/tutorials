package com.baeldung.designpatterns.observer.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.baeldung.designpatterns.observer.util.NewsAgency;
import com.baeldung.designpatterns.observer.util.NewsChannel;

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
