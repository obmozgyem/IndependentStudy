package Before.TheRoadToJavaDeveloper.Massivy;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
/*
Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
Вывести на экран сумму каждого значения с предыдущим.
Предыдущим значением для 0го элемента считать последнее значение массива.
 */
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        input.close();
//        int[] array= {1,2,3,4,5};
        int count = 0;
        for (int i : array) {
            count += i;
            System.out.println(count);
        }

    }
}
