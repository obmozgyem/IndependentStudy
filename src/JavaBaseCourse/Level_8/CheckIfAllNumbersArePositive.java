package JavaBaseCourse.Level_8;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        var result = true;

        for (int i : array) {
            if (i < 0) {
                result = false;
                break;
            }

        }
        System.out.println(result ?"All positive" :"Not all positive");

    }
}
