package JavaBaseCourse.Level_12;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {5, 1, 4, 2, 8};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }


    private static void bubbleSort(int[] array) {
          for (int i = 0; i < array.length; i++) {
            boolean swap=false;
            for (int j = 0; j <array.length-1-i; j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] =temp;
                    swap=true;
                }
                if (!swap) {
                    break;
                }

            }
        }

    }
}
