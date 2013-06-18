package org.androidtransfuse.test3;

import org.androidtransfuse.event.EventManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton public class TestService {
    private List<TestEntry> entries;
    private EventManager eventManager;

    @Inject
    public TestService(EventManager eventManager, List<TestEntry> entries) {
        this.eventManager = eventManager;
        this.entries = entries;
    }

    public void update(){
        eventManager.trigger(new TestEvent("data"));
    }
}
