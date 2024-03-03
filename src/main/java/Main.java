import commands.Command;
import commands.OpenKisteCommand;
import events.KisteEvent;
import models.Item;
import models.Kiste;
import observers.KisteObserver;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Kiste kiste = new Kiste();
        kiste.addItem(new Item("Schwert"));
        kiste.addItem(new Item("Schild"));
        kiste.addItem(new Item("Trank"));

        KisteEvent kisteEvent = new KisteEvent();
        kisteEvent.subscribe(new KisteObserver());

        System.out.println("Drücke 'E' um die model.Kiste zu öffnen oder eine andere Taste um weiterzugehen.");
        try (Scanner scanner = new Scanner(System.in)) {
            String eingabe = scanner.nextLine();

            if ("E".equalsIgnoreCase(eingabe)) {
                Command openKiste = new OpenKisteCommand(kisteEvent, kiste);
                openKiste.execute();
            } else {
                System.out.println("Du gehst weiter und ignorierst die model.Kiste.");
            }
        }
    }
}