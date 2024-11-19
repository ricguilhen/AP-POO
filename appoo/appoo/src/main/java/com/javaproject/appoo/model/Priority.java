package com.javaproject.appoo.model;

import java.util.Comparator;

public enum Priority {

    BAIXA(0),
    MEDIA(1),
    ALTA(2);

    private int value;

    private Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Comparator<Priority> comparadorDePeso = new Comparator<Priority>() {
        public int compare(Priority o1, Priority o2) {
            return o1.getValue() - o2.getValue();
        }
    };

}
