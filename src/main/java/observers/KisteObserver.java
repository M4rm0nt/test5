package observers;

import events.EventType;
import listeners.EventListener;
import models.Item;
import models.Kiste;

public class KisteObserver implements EventListener {

    @Override
    public void update(EventType eventType, Kiste kiste) {
        if (EventType.OPEN == eventType) {
            if (kiste.isEmpty()) {
                System.out.println("Die model.Kiste ist leer.");
            } else {
                System.out.println("Du findest folgende Items in der model.Kiste:");
                for (Item item : kiste.getItems()) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
