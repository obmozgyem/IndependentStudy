package TheRoadToJavaDeveloper.Methods;

import java.util.Scanner;

public class Task1 {
    /*задачи от 14.11.2022
    https://telegra.ph/Metody-Pervoe-znakomstvo-Parametry-Vozvrashchenie-znachenij-11-14
         */
    /*
    Задача 1:
Декомпозировать задачу https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson3/Task2SwitchCase.java
Вынести в отдельный метод использование switch-case. Также вынести в отдельный метод использование  System.out.println
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter string: ");

        String s = scanner.nextLine();

        scanner.close();

        greetingsUser(s);
    }


    private static void greetingsUser(String s) {
        switch (s) {
            case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                outputGreeting("Hello");
//                Вызываем оператор break, чтобы выйти из switch-case
                break;

            case "Bye":
                outputGreeting("Good bye");
                break;

            case "How are you":
                outputGreeting("How are your doing");
                break;

            default:  // Если значение s не совпадает ни с одним кейсом
                outputGreeting("Unknown message");
        }

    }

    private static void outputGreeting(String word) {
        System.out.println("Hello");
    }
}
