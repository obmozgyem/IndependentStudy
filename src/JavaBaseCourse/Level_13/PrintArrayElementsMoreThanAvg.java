package JavaBaseCourse.Level_13;

import java.util.Arrays;
import java.util.stream.IntStream;


public class PrintArrayElementsMoreThanAvg {
    public static void main(String[] args) {



        int[] array = {1, 4, -5, -2, 0, 12};

        //code
        int[] result = printArrayMaxElement(array);

        //result
        System.out.println(Arrays.toString(result));

    }

    private static int[] printArrayMaxElement(int[] array) {
        int[] temp = new int[array.length];


        int index = 0;

        int total = IntStream.of(array).sum() / array.length;
        for (int i = 0; i < array.length; i++) {

            int element = array[i];

            if (element > total) {
                temp[index] = element;
                index++;
            }

        }

        int[] result = new int[index];
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }

        return result;
    }

}
