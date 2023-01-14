package Before.JavaBaseCourse.Level_12;

import java.util.Arrays;



public class ExtractPositiveIntNumbersFromString {


    public static void main(String[] args) {
        // read source data
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";
        // processing
        int[] numbers = extractNumbersFromString(string);
        // display results
        System.out.println(Arrays.toString(numbers));


    }

    private static int[] extractNumbersFromString(final String string) {
        int[] result = new int[string.length()/2+1];
        int count=0;
        StringBuilder stringBuilder = new StringBuilder();
        final String NUMBER ="1234567890";
        for (int i = 0; i < string.length(); i++) {
            var ch= string.charAt(i);
            if (isDigit(ch)) {
                stringBuilder.append(ch);
            } else if(stringBuilder.length() >0) {
                result[count++]= Integer.parseInt(stringBuilder.toString());
                stringBuilder.setLength(0);
            }

        }
        if(stringBuilder.length() >0) {
            result[count++] = Integer.parseInt(stringBuilder.toString());
            stringBuilder.setLength(0);
        }
        return trimResult(result,count);

    }

    private static boolean isDigit(char ch) {
        return ch >='0' && ch <= '9';
    }

    private static int[] trimResult(int[] array, int count) {
        int[] results =new int[count];
    //    System.arraycopy(array, 0, results, 0,count);

        for (int i = 0; i < count; i++) {
            results[i]=array[i];

        }
        return results;
    }

}


