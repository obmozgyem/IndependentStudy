package JavaBaseCourse.Level1_7;

import java.util.Scanner;

public class WhatIsNumber {
    public static void main(String[] args) {

        System.out.println("Please enter number");
        var number1 = new Scanner(System.in).nextInt();
        var number2 = new Scanner(System.in).nextInt();
        System.out.println(Math.max(number1,number2));

    }
}
