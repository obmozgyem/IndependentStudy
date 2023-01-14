package Before.TheRoadToJavaDeveloper.Methods;

import java.util.Scanner;

public class Task2 {
    /*  Декомпозировать задачу https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson3/Task4.java
      Вынести в отдельный метод метод логику, которая отрабатывает, когда первое число кратно и двум, и трем.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        scanner.close();

//        Если а - четное ИЛИ b - кратно трем
        examinationNumber(a, b);
    }


    private static void examinationNumber(int a, int b) {
        if (a % 2 == 0 || b % 3 == 0) {
            System.out.println(a == b);
        }

        if (a % 2 == 0 && a % 3 == 0) {    // Данную проверку можно оптимизировать как a % 6 == 0
//            Записываем в переменную result результат возведения a в степень b
//            Тип double был использован, потому что Math.pow() возвращает именно его.
//            В остальном нам подошел бы и long
            double result = Math.pow(a, b);

//            Если результат превышает допустимые размеры для int
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {    //в ином случае
//                Каст к int необязателен, но позволяет избежать выведения в консоль дробной части
                System.out.println((int) result);
            }

        }
    }
}
