package JavaBaseCourse.Level1_7;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = j * i;
                System.out.print((result == 1 ? " " : result) + "\t");

            }
            System.out.println();

        }
    }
}
