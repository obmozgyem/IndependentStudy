package JavaBaseCourse.Level_10;

public class SumFunctionWithVarArgs {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,2,3));
        
    }

    private static int sum (int... args) {
        var sum = 0;
        for (int arg : args) {
            sum += arg;

        }
        return  sum;

    }
}
