package com.walking.Lesson16_abstract.Task2;

import com.walking.Lesson16_abstract.Task2.model.Answer;
import com.walking.Lesson16_abstract.Task2.model.ByeAnswer;
import com.walking.Lesson16_abstract.Task2.model.HowAreYouAnswer;
import com.walking.Lesson16_abstract.Task2.model.UnknownAnswer;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = scanner.nextLine();

        scanner.close();

        Answer answer;

        switch (s) {
            case "Hi":
                answer = new com.walking.Lesson16_abstract.Task2.HiAnswer();

                break;

            case "Bye":
                answer = new ByeAnswer();

                break;

            case "How are you":
                answer = new HowAreYouAnswer();

                break;

            default:
                answer = new UnknownAnswer();


        }
        System.out.println(answer.getAnswer());
    }


}
