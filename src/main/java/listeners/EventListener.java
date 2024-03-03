package listeners;

import events.EventType;
import models.Kiste;

import java.util.ArrayList;
import java.util.List;

public interface EventListener {
    void update(EventType eventType, Kiste kiste);
}

