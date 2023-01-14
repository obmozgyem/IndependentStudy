package Before.JavaBaseCourse.Level_8;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        int startIndex= 1;
        int endIndex =4;
        int[] array = {1, 10, 3, 7, 5};
        int[] arrayCopy = new int[endIndex-startIndex];


        System.arraycopy(array, 0 + startIndex, arrayCopy, 0, arrayCopy.length);
//        for (int i = 0; i < arrayCopy.length; i++) {
//            arrayCopy[i]= array[i+startIndex];
//        }
        System.out.println(Arrays.toString(arrayCopy));
    }
}
