package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MonatTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Monatsprogramm!");
        System.out.println("---------------------------------");
        System.out.println("Was möchten Sie tun?");
        System.out.println("1. Monat anhand der Zahl anzeigen");
        System.out.println("2. Alle Monate in einem Quartal anzeigen");
        System.out.println("3. Programm beenden");
        System.out.println("---------------------------------");

        while (true) {
            System.out.print("Bitte geben Sie Ihre Wahl ein (1-3): ");
            int wahl = scanner.nextInt();

            switch (wahl) {
                case 1:
                    System.out.print("Geben Sie die Monatszahl (1-12) ein: ");
                    int zahl = scanner.nextInt();
                    Monat monat = Monat.valueOf(zahl);
                    if (monat != null) {
                        System.out.println("Der Monat ist: " + monat.name());
                    } else {
                        System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
                    }
                    break;

                case 2:
                    System.out.print("Geben Sie die Quartalsnummer (1-4) ein: ");
                    int quartal = scanner.nextInt();
                    ArrayList<Monat> monateInQuartal = Monat.getMonateInQuartal(quartal);
                    if (!monateInQuartal.isEmpty()) {
                        System.out.println("Die Monate im " + quartal + ". Quartal sind:");
                        for (Monat m : monateInQuartal) {
                            System.out.println("- " + m.name());
                        }
                    } else {
                        System.out.println("Ungültige Eingabe oder kein Quartal gefunden.");
                    }
                    break;

                case 3:
                    System.out.println("Vielen Dank, dass Sie das Monatsprogramm verwendet haben. Auf Wiedersehen!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ungültige Auswahl. Bitte wählen Sie 1, 2 oder 3.");
            }

            System.out.println("---------------------------------");
        }
    }
}