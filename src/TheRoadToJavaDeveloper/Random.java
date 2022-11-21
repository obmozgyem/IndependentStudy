package TheRoadToJavaDeveloper;

import java.util.Scanner;

public class Random {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        while (true) {
            if (a == 1) {
                System.out.println("Yes");
                break;
            } else {
                System.out.println("No");
                a = number.nextInt();
            }
        }
    }
}
