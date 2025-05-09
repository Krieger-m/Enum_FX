package org.example;

public enum Monat {

    JANUAR(1,1),
    FEBRUAR(2,1),
    MÄRZ(3,1),
    APRIL(4,2),
    MAI(5,2),
    JUNI(6,2),
    JULI(7,3),
    AUGUST(8,3),
    SEPTEMBER(9,3),
    OKTOBER(10,4),
    NOVEMBER(11,4),
    DEZEMBER(12,4);

    private final int zahl;
    private final int quartal;

    Monat(int zahl, int quartal) {

        this.zahl = zahl;
        this.quartal = quartal;
    }

    public int getZahl() {
        return zahl;
    }

    public int getQuartal() {
        return quartal;
    }

    public static java.util.ArrayList<Monat> getMonateInQuartal(int quartal) {
        java.util.ArrayList<Monat> monate = new java.util.ArrayList<Monat>();
        for (Monat monat : values()) {
            if (monat.getQuartal() == quartal) {
                monate.add(monat);
            }
        }
        return monate;
    }

    public static Monat valueOf(int zahl) {
        for (Monat monat : values()) {
            if (monat.getZahl() == zahl) {
                return monat;
            }
        }
        return null;
    }
}

