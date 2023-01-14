package Before.TheRoadToJavaDeveloper.Lesson8;

public class Task1 {
    public static void main(String[] args) {
        /**
         Реализовать класс-счетчик. Полями класса должны выступать название счетчика и, непосредственно, целочисленный счетчик.
         Реализовать для созданного класса конструктор с двумя параметрами, с одним (значение счетчика в таком случае инициализировать как 0),
         методы увеличения и уменьшения счетчиков на 1 и на заданное пользователем целом значение.
         Методы должны возвращать актуальное значение счетчика.
         Используя созданный класс, посчитать количество четных и количество нечетных чисел в ряду от 1 до 100.
         Конечные показатели счетчиков вывести в консоль.
         Пример вывода в консоли:
         Нечетные числа: 50
         Четные числа: 50
         */
        Count count1 = new Count("name", 0);
        Count count2 = new Count("name2", 0);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                count1.increment();
            } else {
                count2.increment();

            }

        }
        printCounterValue(count1);
        printCounterValue(count2);

    }

    static void printCounterValue(Count count) {
        System.out.printf("%s: %d\n", count.name, count.countNumber);
    }

}
