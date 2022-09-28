package JavaBaseCourse.Level_9;

public class FindMinString {
    public static void main(String[] args) {

        String[] array = {"one", "two", "three", "four", "five"};
        String  comparison= array[0];
        for (int i = 1; i < array.length; i++) {
                 if ((array[i].compareTo(comparison)) <  0) {
                comparison= array[i];

            }

        }
        System.out.println(comparison);

        StringBuilder aa= new StringBuilder("Hello world!");
        aa.reverse();
        System.out.println(aa);
    }
}
