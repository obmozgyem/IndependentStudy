package com.walking.Lesson12.counterAggregation;

public class CounterService {
    /*
    Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
    получение всех доступных счетчиков, получение доступа к счетчику по названию,
    увеличение значения счетчика на единицу или заданное значение, а также сброс счетчика до нулевого значения.
     */
    private Counter[] counters;


    public CounterService(Counter... counters) {
        this.counters = counters;
    }

    public Counter[] getAllCounters() {
        return counters;
    }

    public Counter[] addNewCounters(Counter counter) {
        int newArrayLength = counters.length + 1;
        Counter[] newCounters = new Counter[newArrayLength];
        newCounters[newArrayLength - 1] = counter;

        System.arraycopy(counters, 0, newCounters, 0, counters.length);
        counters = newCounters;

        return newCounters;
    }



    public Counter reset(Counter counter) {
        counter.setValue(0);
        return counter;
    }

    public void printCountersResult(Counter[] countersArray) {

        for (Counter counter : countersArray) {
            System.out.println(counter.toString());
        }
    }

    public Counter addValueCounter(Counter counter, int value) {


        counter.setValue(counter.getValue() + value);
        return counter;


    }


}
