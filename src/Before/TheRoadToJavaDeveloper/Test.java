package Before.TheRoadToJavaDeveloper;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Выводим сообщение "Enter string: " в консоль.
//        Данное сообщение не является обязательным, лишь информирует пользователя,
//        какое действие от него ожидается
        System.out.print("Enter string: ");
//        Объявляем переменную s типа String и записываем в нее значение, введенное с клавиатуры
        String s = scanner.nextLine();

//        Сканер более не используется, ее необходимо закрыть.
//        Зачем - разберемся, когда будем изучать I/O Streams
        scanner.close();

//        Используем конструкцию switch-case для переменной s
        extracted(s);
//
//        String[] nums = new String[5];
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the 2nd number: ");
//        int number = scanner.nextInt();
//
//        scanner.close();
//
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                int result = i + number;
//                System.out.printf("%d + %d = %d\n", i, number, result);
//            } else {
//                int result = i - number;
//                System.out.printf("%d - %d = %d\n", i, number, result);
//            }
//
//            if (i == number) {
//                System.out.println("Числа равны!");
//            }
//        }
    }

    private static void extracted(String s) {
        switch (s) {
            case "Hi":  // Если s равно "Hi"
//                Выводим в консоль "Hello"
                System.out.println("Hello");
//                Вызываем оператор break, чтобы выйти из switch-case
                break;

            case "Bye":
                System.out.println("Good bye");
                break;

            case "How are you":
                System.out.println("How are your doing");
                break;

            default:  // Если значение s не совпадает ни с одним кейсом
                System.out.println("Unknown message");
        }
    }
}


