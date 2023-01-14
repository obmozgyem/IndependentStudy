package Before.JavaBaseCourse.Level_8;

public class FindMinElement {
    public static void main(String[] args) {
        int[] array = {1, -2, 8, 0, -5};

        int minNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        System.out.println(minNumber);
    }
}