package Before.JavaBaseCourse.Level_8;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 8, 5};

        //processing
        int[] result = getIndexMaxAndMinElements(array);
        int min = result[0];
        int max = result[1];
        swap(array, min, max);

        System.out.println(Arrays.toString(array));

    }

    private static int[] getIndexMaxAndMinElements(int[] array) {
        int minNumber = array[0];
        int maxNumber = array[0];

        int min = 0;
        int max = 0;

        for (int i = 1; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
                min = i;
            }
            if (maxNumber < array[i]) {
                maxNumber = array[i];
                max = i;
            }

        }
        return new int[]{min, max};
    }

    private static void swap(int[] array, int min, int max) {
        var temp = array[min];
        array[min] = array[max];
        array[max] = temp;
    }
}
