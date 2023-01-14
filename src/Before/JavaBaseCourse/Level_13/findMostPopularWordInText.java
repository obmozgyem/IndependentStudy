package Before.JavaBaseCourse.Level_13;

import java.util.Arrays;

public class findMostPopularWordInText {
    public static void main(String[] args) {
        String text = "hello,java-world\tjava hello: I? Hello! Java World. java";
//[hello, java, world, java, hello, I, Hello, Java, World, java]

        StringBuilder stringBuilder = new StringBuilder();
        String[] result = new String[text.length()];

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            var ch = text.charAt(i);
            if (Character.isDigit(ch) || Character.isLetter(ch)) {
                stringBuilder.append(ch);
            } else if (stringBuilder.length() > 0) {

                result[index++] = stringBuilder.toString();
                stringBuilder.setLength(0);
            }

        }
        if (stringBuilder.length() > 0) {

            result[index++] = stringBuilder.toString();
            stringBuilder.setLength(0);
        }
        System.out.println(Arrays.toString(result));
    }
}
