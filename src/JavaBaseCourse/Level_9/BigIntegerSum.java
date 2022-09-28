package JavaBaseCourse.Level_9;

import java.math.BigInteger;

public class BigIntegerSum {
    public static void main(String[] args) {
        String a = "123456789012345678901234567890123456789012345678901234567890";
        String b = "12345678901234567890123456789012345678901234567890";
        // 123456789024691357802469135780246913578024691357802469135780
        var a1 = a.length() >= b.length() ? a : "0".repeat(b.length() - a.length()) + a;
        var b1 = b.length() >= a.length() ? b : "0".repeat(a.length() - b.length()) + b;
        int sum = 0;
        int result = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = a1.length() - 1; i >= 0; i--) {

            int a2 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            int b2 = Integer.parseInt(String.valueOf(b1.charAt(i)));

            result = a2 + b2 + sum;

            if (result > 9) {
                sum = 1;
                result = result % 10;
            } else {
                sum = 0;
            }
            builder.insert(0, result);
        }
        if (sum != 0) {
            builder.insert(0, sum);
        }
        System.out.println(builder.toString());
        System.out.println(new BigInteger(a1).add(new BigInteger(b1)));
    }


}

