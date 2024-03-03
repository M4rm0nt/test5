package events;

import listeners.EventListener;
import models.Kiste;

import java.util.ArrayList;
import java.util.List;

public class KisteEvent {
    private List<EventListener> listeners = new ArrayList<>();

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(EventType eventType, Kiste kiste) {
        for (EventListener listener : listeners) {
            listener.update(eventType, kiste);
        }
    }
}
