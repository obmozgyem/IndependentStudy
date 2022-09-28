package JavaBaseCourse.Level_12;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int number = 0;


        int index =binarySearch(array, number);
        System.out.println(index);

    }

    private static int binarySearch(int[] array, int number) {
        int starIndex = 0;
        int endIndex = array.length - 1;



        while (starIndex <= endIndex) {
  //          int middleIndex = (starIndex + endIndex) / 2;
            int middleIndex = (starIndex + endIndex) >>>1;
            int middleValue = array[middleIndex];
            if (number > middleValue) {
                starIndex = middleIndex + 1;
            } else if (number < middleValue) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;

    }
}
