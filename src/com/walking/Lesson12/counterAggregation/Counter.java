package com.walking.Lesson12.counterAggregation;

import java.util.Locale;

public class Counter {

    public final static String UNIT = "м³";
    public final static String UNIT2 = "кВт/ч";
    private CounterImmutable name;

    private int value;

    public Counter(CounterImmutable name, int counter) {
        this.name = name;
        this.value = counter;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(name.toString().toLowerCase(Locale.ROOT));
        sb.append(": " + value + " ");

        if (name != CounterImmutable.ЭЛЕКТРИЧЕСТВО) {

            return sb.toString() + UNIT;
        }
        return sb.toString() + UNIT2;

    }

    public CounterImmutable getName() {
        return name;
    }

    public void setName(CounterImmutable name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
