package com.baeldung.designpatterns.observer.beans;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.baeldung.designpatterns.observer.beans.NewsAgency;

public class ObserverIntegrationTest {

    @Test
    public void whenChangingObservableState_thenObserverNotified() {

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addPropertyChangeListener(observer);

        observable.setNews("news1");
        assertEquals(observer.getNews(), "news1");

        observable.setNews("news2");
        assertEquals(observer.getNews(), "news2");
    }
}
