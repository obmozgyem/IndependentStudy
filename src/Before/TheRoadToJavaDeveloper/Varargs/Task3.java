package Before.TheRoadToJavaDeveloper.Varargs;

import java.util.Scanner;

public class Task3 {
    //  Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorial(number));

    }

    public static int factorial(int number) {


        if (number == 1) {

            return 1;
        }
        return number * factorial(number - 1);

    }
}
