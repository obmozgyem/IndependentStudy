package Before.JavaBaseCourse.Level_10;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        // read source data
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // processing
        reverse(array);
        // display results
      System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int sum=0;
        for (int i = 0; i < array.length/2; i++) {
                sum = array[i];
                array[i]=array[array.length-i-1];
            array[array.length-i-1]= sum;

        }

    }
}
