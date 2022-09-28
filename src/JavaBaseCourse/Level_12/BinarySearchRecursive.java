package JavaBaseCourse.Level_12;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int number = 0;

        int index = BinarySearchRecursive(array, number, 0, array.length - 1);
        System.out.println(index);

    }

    private static int BinarySearchRecursive(int[] array,
                                             int number, int starIndex, int endIndex) {


        if (starIndex <= endIndex) {
            //          int middleIndex = (starIndex + endIndex) / 2;
            int middleIndex = (starIndex + endIndex) >>>1;
            int middleValue = array[middleIndex];
            if (number > middleValue) {

                return BinarySearchRecursive(array, number, middleIndex + 1, endIndex);
            } else if (number < middleValue) {

                return BinarySearchRecursive(array, number, middleIndex, endIndex - 1);
            } else {
                return middleIndex;
            }
        }
        return -1;

    }
}
