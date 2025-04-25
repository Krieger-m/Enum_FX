package com.example.enum_fx;

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

    }


}

