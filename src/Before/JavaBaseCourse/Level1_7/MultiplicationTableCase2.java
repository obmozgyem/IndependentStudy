package Before.JavaBaseCourse.Level1_7;

public class MultiplicationTableCase2 {
    public static void main(String[] args) {
        int value = 9;


        for (int r = 2; r <= value; r += 4) {
            for (int i = 2; i <= value; i++) {
                for (int j = r; j < r + 4; j++) {
                    int result = j * i;
                    System.out.print(j + " * " + i + "= " + result + "\t");

                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
