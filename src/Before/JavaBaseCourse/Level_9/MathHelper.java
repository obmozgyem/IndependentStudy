package Before.JavaBaseCourse.Level_9;

import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {

        extracted();
        
    }

    private static void extracted() {
        while (true) {
            System.out.println("Enter cmd: {pi, e, exit or quit}");
            String request = new Scanner(System.in).nextLine();
            if ("exit".equals(request) || "quit".equals(request)) {
                break;
            }

            if ("e".equals(request)) {
                System.out.println(Math.E);
            }
            if ("pi".equals(request)) {
                System.out.println(Math.PI);
            } else {
                System.out.println("Invalid cmd.Try again !");
            }

        }
    }
}

