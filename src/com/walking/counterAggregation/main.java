package com.walking.counterAggregation;

/*
азработать программу в рамках компании com.walking, позволяющую следить за счетчиками
на газ, холодную воду, горячую воду и электричество. Обозначение программы в рамках компании — counterAggregation.
Используя за основу задачу из темы про классы и объекты (ссылка на разбор),
реализовать класс счетчика, который хранит название счетчика и его значение, его единицы измерения,
а также обеспечивает доступ к значениям. Название счетчика и его единицы измерения должны быть неизменны.
Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
получение всех доступных счетчиков, получение доступа к счетчику по названию,
увеличение значения счетчика на единицу или заданное значение, а также сброс счетчика до нулевого значения.
Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
Также реализовать в классе Main приватный метод,
который позволяет вывести значения счетчиков в виде: <Название счетчика>: <Значение счетчика>.
Например:
Газ: 2333
Горячая вода: 0
Холодная вода: 23

...
 */


public class main {
    public static void main(String[] args) {


        Counter electricity = new Counter(CounterImmutable.ЭЛЕКТРИЧЕСТВО, 150);
        Counter hot_water = new Counter(CounterImmutable.ГОРЯЧАЯ_ВОДА, 11);
        Counter cold_water = new Counter(CounterImmutable.ХОЛОДНАЯ_ВОДА, 15);
        Counter gaz = new Counter(CounterImmutable.ГАЗ, 350);

        /*   System.out.println(electricity.getValue());
        counterService.reset(electricity);
        counterService.addValueCounter(gaz, -1000);
        System.out.println(electricity.getValue());
        System.out.println();

         */

        CounterService counterService = new CounterService();
        counterService.addNewCounters(electricity);
        counterService.addNewCounters(gaz);
        counterService.addNewCounters(hot_water);
        counterService.addNewCounters(cold_water);

        counterService.printCountersResult(counterService.getAllCounters());


    }


}
