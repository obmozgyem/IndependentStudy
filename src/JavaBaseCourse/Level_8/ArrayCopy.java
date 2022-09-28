package JavaBaseCourse.Level_8;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array = {1, 10, 3, 4, 5};
int[] arrayCopy = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            arrayCopy[i]= array[i];

        }
        for (int i : arrayCopy) {
            System.out.println(i);
        }
    }
}
