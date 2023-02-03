package com.walking.Lesson17_enum.Task1;

import java.util.Scanner;

/**
 * Написать программу, которая принимает строку с клавиатуры.
 * Если строка == "Hi" - вывести в консоль "Hello",
 * если Bye - Good bye,
 * если How are you - How are your doing.
 * Если любая другая строка - вывести Unknown message.
 * Сделать через switch-case
 */
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = scanner.nextLine();

        scanner.close();


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