package commands;

import events.EventType;
import events.KisteEvent;
import models.Kiste;

public class OpenKisteCommand implements Command {
    private KisteEvent kisteEvent;
    private Kiste kiste;

    public OpenKisteCommand(KisteEvent kisteEvent, Kiste kiste) {
        this.kisteEvent = kisteEvent;
        this.kiste = kiste;
    }

    @Override
    public void execute() {
        kisteEvent.notify(EventType.OPEN, kiste);
    }
}
